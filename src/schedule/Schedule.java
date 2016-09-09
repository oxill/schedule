package schedule;

import java.io.IOException;

/**
 * Created by Ilya on 31.08.2016.
 */
public class Schedule {
    public static void main(String[] args) throws IOException {       
        Teacher teacher1 = new Teacher("teacher1RUS");
        Teacher teacher2 = new Teacher("teacher2MATH");
        Teacher teacher3 = new Teacher("teacher3BIO"); 
        
        Class class1 = new Class("class1");
        Class class2 = new Class("class2");
        
        /*class1.addLesson();
        teacher1.addLesson();
        teacher2.addLesson();*/                
        
        class1.addLessonHardCode(Lessons.RUS, 4);
        class1.addLessonHardCode(Lessons.MATH, 3);
        class1.addLessonHardCode(Lessons.BIO, 2);
        class2.addLessonHardCode(Lessons.RUS, 4);
        class2.addLessonHardCode(Lessons.MATH, 3);
        class2.addLessonHardCode(Lessons.BIO, 2);
        
        teacher1.addLessonHardCode(Lessons.RUS, 8);
        teacher2.addLessonHardCode(Lessons.MATH, 6);
        teacher3.addLessonHardCode(Lessons.BIO, 4);

        Mixer.addClass(class1);
        Mixer.addClass(class2);
        
        Mixer.addTeacher(teacher1);
        Mixer.addTeacher(teacher2);        
        Mixer.addTeacher(teacher3);
        
        Mixer.showTeachersLessonsLoad();
        Mixer.showClassesLessonsLoad();                
        
        Mixer.scheduleForEveryDay();
        System.out.println("------");
        Mixer.showTeachersWeekLoad();
        Mixer.showClassesWeekLoad();
        
    }
}
