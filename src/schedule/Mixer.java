package schedule;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ilya on 01.09.2016.
 */
public class Mixer {
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<Class> classes = new ArrayList<>();

    public static void addTeacher(Teacher teacher) {
        //создавать Teacher здесь
        //перенести из schedule main
        //либо вообще сделать их как внутренние классы
        // но лучше просто запихать в отдельный пакет class, creator, teacher, mixer и инициализацию этих классов делать только в mixer
        teachers.add(teacher);
    }

    public static void addClass(Class aClass) {
        //создавать Class здесь
        classes.add(aClass);
    }

    public static void showTeachersLL() {
        for (Teacher teacher :
                teachers) {
            System.out.println(teacher.getFullName());
            teacher.showLessonsAndLoad();
        }
    }

    public static void showClassesLL() {
        for (Class aClass :
                classes) {
            System.out.println(aClass.getFullName());
            aClass.showLessonsAndLoad();
        }
    }
    
    public static void showTeachersWL() {
        for (Teacher teacher :
                teachers) {
            System.out.println(teacher.getFullName());
            teacher.showWeekAndList();
        }
    }

    public static void showClassesWL() {
        for (Class aClass :
                classes) {
            System.out.println(aClass.getFullName());
            aClass.showWeekAndList();
        }
    }
    
    private static boolean hasMainLoad() {
        boolean hasAnyTeacherLoad = false;
        boolean hasAnyClassLoad = false;
        for (Teacher teacher : teachers) {
            if (teacher.getMainLoad() > 0) {
                hasAnyTeacherLoad = true;
                break;
            }
        }
        
        for (Class c : classes) {
            if (c.getMainLoad() > 0) {
                hasAnyClassLoad = true;
                break;
            }
        }
        return hasAnyTeacherLoad && hasAnyClassLoad;        
    }
    
    public static void testWhile() {        
        while (hasMainLoad()) {
            for (Class c : classes) { 
                System.out.println("class load " + c.getMainLoad());
                for (Teacher teacher : teachers) {   
                    System.out.println("teacher load " + teacher.getMainLoad());
                    c.reduceMainLoad();
                    teacher.reduceMainLoad();
                }
            }
        }
    }
    
    public static void scheduleForEveryDay() {        
        while (hasMainLoad()) {            
            for (Week w : Week.values()) {                
                for (Class c : classes) { 
                    System.out.println(c.getMainLoad());
                    EnumMap<Lessons, Integer> classlessonAndLoad = c.getLessonAndLoad();
                    for (Map.Entry<Lessons, Integer> classEntry : classlessonAndLoad.entrySet()) {
                        Lessons classLesson = classEntry.getKey();
                        int classLoad = classEntry.getValue();
                        if (classLoad > 0) {
                            for (Teacher teacher : teachers) {                                  
                                EnumMap<Lessons, Integer> teacherlessonAndLoad = teacher.getLessonAndLoad();
                                for (Map.Entry<Lessons, Integer> teacherEntry : teacherlessonAndLoad.entrySet()) {
                                    Lessons teacherLesson = teacherEntry.getKey();
                                    int teacherLoad = teacherEntry.getValue();
                                    if (teacherLoad > 0) {
                                        if (teacherLesson.equals(classLesson)) { // если учитель ведет такой урок
                                            if (teacher.getWeekAndList().get(w).size() == c.getWeekAndList().get(w).size()) {// если у учителя в этот день есть свободный урок, то добавить его к учителю и классу
                                                c.addTeacher(w, teacher);
                                                teacher.addClass(w, c);                                            
                                                c.reduceMainLoad();
                                                teacher.reduceMainLoad();                                            
                                                c.reduceLoadForLesson(classLesson);
                                                teacher.reduceLoadForLesson(teacherLesson);
                                                //break; добавить метки для лучшего выхода и меньшего количества итераций
                                            }   
                                        }
                                    }
                                }
                            }
                        }
                    }                
                }
            }
        }       
    }
}


