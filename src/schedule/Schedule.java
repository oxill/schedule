package schedule;

import java.io.IOException;

/**
 * Created by Ilya on 31.08.2016.
 */
public class Schedule {
    public static void main(String[] args) throws IOException {
        Teacher teacher1 = new Teacher("teacher1");
        Teacher teacher2 = new Teacher("teacher2");
        Class aClass1 = new Class("class1", 1);
        Class aClass2 = new Class("class2", 2);
        teacher1.addLessons();
        Mixer.addTeacher(teacher1);
        Mixer.showTeachers();

    }
}
