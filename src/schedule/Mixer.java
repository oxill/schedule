package schedule;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ilya on 01.09.2016.
 */
public class Mixer {

    private static Set<Teacher> teachers = new LinkedHashSet<>();
    private static Set<Class> classes = new LinkedHashSet<>();
    
    public static void showSizeSets() {
        for (Class c : classes)
            System.out.println(c.getFullNameClass());
    }

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
        for (Teacher teacher
                : teachers) {
            System.out.println(teacher.getFullNameTeacher() + ":");
            teacher.showLessonsAndLoad();
            //teacher.showInfo();
        }
    }

    public static void showClassesLessonsLoad() {
        for (Class aClass
                : classes) {
            System.out.println(aClass.getFullNameClass() + ":");
            aClass.showLessonsAndLoad();
        }
    }

    public static void showTeachersWeekLoad() {
        for (Teacher teacher
                : teachers) {
            System.out.print(teacher.getFullNameTeacher() + " ");
            teacher.showWeekAndList();
            System.out.println("");
        }
    }

    public static void showClassesWeekLoad() {
        for (Class aClass
                : classes) {
            System.out.print(aClass.getFullNameClass() + " ");
            aClass.showWeekAndList();
            System.out.println("");
        }
    }

    private static boolean hasMainLoad() {
        boolean hasTeacherLoad = false;
        boolean hasClassLoad = false;
        for (Teacher teacher : teachers) {
            if (teacher.getMainLoad() > 0) {
                hasTeacherLoad = true;
                break;
            }
        }

        for (Class c : classes) {
            if (c.getMainLoad() > 0) {
                hasClassLoad = true;
                break;
            }
        }
        return hasTeacherLoad && hasClassLoad;
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

    public static void createSchedule() { // цикл для составления расписания по выбору свободного учителя из всех доступных
        int i = 1;
        while (hasMainLoad()) {

            System.out.println("Main loop count " + i);
            i++;
            for (DayOfWeek w : DayOfWeek.values()) {
                System.out.println(w.name());
                label:
                for (Class c : classes) {
                    
                    EnumMap<Lessons, Double> classlessonAndLoad = c.getMapLessonAndLoad();

                    for (Map.Entry<Lessons, Double> classEntry : classlessonAndLoad.entrySet()) {
                        Lessons classLesson = classEntry.getKey();
                        double classLoad = classEntry.getValue();
                        
                        if (classLoad > 0) {
                            //System.out.println(c.getFullNameClass() + " mainLoad " + c.getMainLoad());
                            //System.out.println(classLesson + " " + classLoad);
                            for (Teacher teacher : teachers) {
// пока делаю выход из цикла по учителям, предполагая, что на один предмет подходит один учитель, если надо выбирать между ними, но надо изменить этот цикл
                                
                                if (teacher.isFreeDay(w)) {
                                    continue;
                                }
                                EnumMap<Lessons, Integer> teacherlessonAndLoad = teacher.getLessonAndLoad();
                                for (Map.Entry<Lessons, Integer> teacherEntry : teacherlessonAndLoad.entrySet()) {
                                    Lessons teacherLesson = teacherEntry.getKey();
                                    int teacherLoad = teacherEntry.getValue();
                                    
                                    if (teacherLoad > 0) {
                                        //System.out.println(teacher.getFullNameTeacher() + " mainLoad " + teacher.getMainLoad());
                                        //System.out.println(teacherLesson + " " + teacherLoad);
                                        if (teacher.hasClass(classLesson, c)) {
                                            //System.out.println("TEACHER " + teacher.getFullNameTeacher() + " HAS A CLASS " + c.getFullNameClass());                                       
                                            //if (teacherLesson.equals(classLesson)) { // если учитель ведет такой урок
                                            int teacherLessonCount = teacher.getTeacherLessonCount(w);
                                            int classLessonCount = c.getClassLessonCount(w);
                                            //System.out.println(w.name() + c.getFullNameClass() + classTodaySize);
                                            //System.out.println(w.name() + teacher.getFullNameTeacher() + teacherTodaySize);
                                            // чтобы не добавлять учителю пустые уроки просто так
                                            // надо проверить, что больше ни у одного класса нет свободного урока как у учителя
                                            if (teacherLessonCount <= classLessonCount) {// если у учителя в этот день есть свободный урок, то добавить его к учителю и классу                                                                                                
                                                c.addLessonToday(w, classLesson);
                                                c.addTeacherToday(w, teacher);
                                                System.out.println("class " + c.getFullNameClass() + " " + w + " " + teacher.getFullNameTeacher() + " " + teacherLesson);
                                                while (teacherLessonCount < classLessonCount) {
                                                    teacher.addClassToday(w, new Class(0, "", 0));
                                                    teacherLessonCount++;
                                                }
                                                teacher.addClassToday(w, c);
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
                    c.addLessonToday(w, Lessons.XXX);
                }
            }
        }
    }
            
    public static void createTeachersFreeDay(Lessons lesson, DayOfWeek day) {
        for (Teacher teacher : teachers) {
            if (teacher.getLessonAndLoad().containsKey(lesson)) {
                teacher.addFreeDay(day);
            }
        } 
    }
    
    public static void showFreeDay() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getFullNameTeacher() + " " + teacher.getFreeDay());
        }
    }

    public static void addClassessLesson(Lessons l, double load, int classNumber) {
        for (Class c : classes) {
            if (c.getClassNumber() == classNumber) {
                c.addLessonHardCode(l, load);
            }
        }
    }
}
/*class 11А MONDAY Исаенко TECHNOLOGY
class 8Б THURSDAY Исаенко TECHNOLOGY
class 9А  TUESDAY Исаенко TECHNOLOGY
class 9Б THURSDAY Исаенко TECHNOLOGY
class 9В MONDAY Исаенко TECHNOLOGY
class 7А WEDNESDAY Исаенко TECHNOLOGY 
class 10А SATURDAY Исаенко TECHNOLOGY
class 6А MONDAY Исаенко TECHNOLOGY
class 5А TUESDAY Исаенко TECHNOLOGY
class 8А WEDNESDAY Исаенко TECHNOLOGY
class 8Б SATURDAY Исаенко TECHNOLOGY
*/