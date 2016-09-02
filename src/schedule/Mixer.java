package schedule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ilya on 01.09.2016.
 */
public class Mixer {
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<Class> classes = new ArrayList<>();

    public static void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public static void addClass(Class aClass) {
        classes.add(aClass);
    }

    public static void showTeachers() {
        for (Teacher teacher :
                teachers) {
            System.out.println(teacher.getFullName());
            teacher.showLessons();
            teacher.showLoad();
        }
    }

    public static void showClasses() {
        for (Class aClass :
                classes) {
            System.out.println(aClass.getFullName());
            aClass.showLessons();
            aClass.showLoad();
        }
    }

    public static void mixSchedule() {

    }

}
