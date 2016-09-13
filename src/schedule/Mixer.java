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

    public static void showTeachersLessonsLoad() {
        for (Teacher teacher :
                teachers) {
            System.out.println(teacher.getFullNameTeacher());
            teacher.showLessonsAndLoad();
        }
    }

    public static void showClassesLessonsLoad() {
        for (Class aClass :
                classes) {
            System.out.print(aClass.getFullNameClass() + " ");
            aClass.showLessonsAndLoad();
        }
    }
    
    public static void showTeachersWeekLoad() {
        for (Teacher teacher :
                teachers) {
            System.out.print(teacher.getFullNameTeacher() + " ");
            teacher.showWeekAndList();
            System.out.println("");
        }
    }

    public static void showClassesWeekLoad() {
        for (Class aClass :
                classes) {
            System.out.print(aClass.getFullNameClass() + " ");
            aClass.showWeekAndList();
            System.out.println("");
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
        int i = 1;
        while (hasMainLoad()) {            
            System.out.println("Main loop count " + i);
            i++;
            for (Week w : Week.values()) {  
                label:
                for (Class c : classes) { 
                    System.out.println(c.getFullNameClass() + " mainLoad " + c.getMainLoad());
                    EnumMap<Lessons, Integer> classlessonAndLoad = c.getLessonAndLoad();
                    
                    for (Map.Entry<Lessons, Integer> classEntry : classlessonAndLoad.entrySet()) {
                        Lessons classLesson = classEntry.getKey();
                        int classLoad = classEntry.getValue();
                        if (classLoad > 0) {
                            for (Teacher teacher : teachers) {  
// пока делаю выход из цикла по учителям, предполагая, что на один предмет подходит один учитель, если надо выбирать между ними, но надо изменить этот цикл
                                System.out.println(teacher.getFullNameTeacher() + " mainLoad " + teacher.getMainLoad());
                                EnumMap<Lessons, Integer> teacherlessonAndLoad = teacher.getLessonAndLoad();
                                for (Map.Entry<Lessons, Integer> teacherEntry : teacherlessonAndLoad.entrySet()) {
                                    Lessons teacherLesson = teacherEntry.getKey();
                                    int teacherLoad = teacherEntry.getValue();
                                    if (teacherLoad > 0) {
                                        if (teacherLesson.equals(classLesson)) { // если учитель ведет такой урок
                                            int teacherTodaySize = teacher.getWeekAndList().get(w).size();
                                            int classTodaySize = c.getWeekAndList().get(w).size();
                                            if (teacherTodaySize <= classTodaySize) {// если у учителя в этот день есть свободный урок, то добавить его к учителю и классу                                                                                                
                                                c.addTeacher(w, classLesson);
                                                System.out.println("class " + c.getFullNameClass() + w + " " + teacher.getFullNameTeacher() + " " + teacherLesson);
                                                while(teacherTodaySize < classTodaySize) {
                                                    teacher.addClass(w, new Class(0, ""));
                                                    teacherTodaySize++;
                                                }
                                                teacher.addClass(w, c);                                            
                                                System.out.println("teacher added " + w + " " + c.getFullNameClass());
                                                c.reduceMainLoad();
                                                teacher.reduceMainLoad();                                            
                                                c.reduceLoadForLesson(classLesson);
                                                teacher.reduceLoadForLesson(teacherLesson);
                                                continue label;
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


