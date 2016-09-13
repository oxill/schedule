package schedule;

import java.io.IOException;

/**
 * Created by Ilya on 31.08.2016.
 */
public class Schedule {
    public static void main(String[] args) throws IOException {                      
        Teacher teacher1 = new Teacher("teacherRUS&LIT");// добавить учителю несколько уроков
        Teacher teacher2 = new Teacher("teacherMATH");
        Teacher teacher3 = new Teacher("teacherBIO"); 
        
        Class class5a = new Class(5, "a");
        Class class5b = new Class(5, "b");
        
        Class class6a = new Class(6, "a");
        Class class6b = new Class(6, "b");
        
        /*class5a.addLesson();
        teacher1.addLesson();
        teacher2.addLesson();*/                
        
        class5a.addLessonHardCode(Lessons.RUS, 4);
        class5a.addLessonHardCode(Lessons.MATH, 3);
        class5a.addLessonHardCode(Lessons.BIO, 2);
        class5a.addLessonHardCode(Lessons.LIT, 4);
        
        class5b.addLessonHardCode(Lessons.RUS, 4);
        class5b.addLessonHardCode(Lessons.MATH, 3);
        class5b.addLessonHardCode(Lessons.BIO, 2);
        class5b.addLessonHardCode(Lessons.LIT, 4);
        
        class6a.addLessonHardCode(Lessons.RUS, 5);
        class6a.addLessonHardCode(Lessons.MATH, 4);
        class6a.addLessonHardCode(Lessons.BIO, 3);
        class6a.addLessonHardCode(Lessons.LIT, 5);
        
        class6b.addLessonHardCode(Lessons.RUS, 5);
        class6b.addLessonHardCode(Lessons.MATH, 4);
        class6b.addLessonHardCode(Lessons.BIO, 3);
        class6b.addLessonHardCode(Lessons.LIT, 5);
        
        teacher1.addLessonHardCode(Lessons.RUS, 18);
        teacher1.addLessonHardCode(Lessons.LIT, 18);
        teacher2.addLessonHardCode(Lessons.MATH, 14);
        teacher3.addLessonHardCode(Lessons.BIO, 10);

        Mixer.addClass(class5a);
        Mixer.addClass(class5b);
        Mixer.addClass(class6a);
        Mixer.addClass(class6b);
        
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
