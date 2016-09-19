package schedule;

import java.io.IOException;

/**
 * Created by Ilya on 31.08.2016.
 */
public class Schedule {
    public static void main(String[] args) throws IOException {                      
        Teacher teacher1 = new Teacher("teacher1");// добавить учителю несколько уроков
        Teacher teacher2 = new Teacher("teacher2");
        Teacher teacher3 = new Teacher("teacher3"); 
        
        Class class5a = new Class(5, "a", 27);
        Class class5b = new Class(5, "b", 25);
        Class class5c = new Class(5, "c", 24);
        
        Class class6a = new Class(6, "a", 25);
        Class class6b = new Class(6, "b", 25);
        
        /*class5a.addLessonFromKeyboard();
        teacher1.addLessonFromKeyboard();
        teacher2.addLessonFromKeyboard();*/                
        
        class5a.addLessonHardCode(Lessons.RUSSIAN, 4);
        class5a.addLessonHardCode(Lessons.MATHEMATICS, 3);
        class5a.addLessonHardCode(Lessons.BIOLOGY, 2);
        
        
        class5b.addLessonHardCode(Lessons.RUSSIAN, 4);
        class5b.addLessonHardCode(Lessons.MATHEMATICS, 3);
        class5b.addLessonHardCode(Lessons.BIOLOGY, 2);
        
        class5c.addLessonHardCode(Lessons.RUSSIAN, 4);
        class5c.addLessonHardCode(Lessons.MATHEMATICS, 3);
        class5c.addLessonHardCode(Lessons.BIOLOGY, 2);
        
        
        class6a.addLessonHardCode(Lessons.RUSSIAN, 5);
        class6a.addLessonHardCode(Lessons.MATHEMATICS, 4);
        class6a.addLessonHardCode(Lessons.BIOLOGY, 3);        
        
        class6b.addLessonHardCode(Lessons.RUSSIAN, 5);
        class6b.addLessonHardCode(Lessons.MATHEMATICS, 4);
        class6b.addLessonHardCode(Lessons.BIOLOGY, 3);        
        
        teacher1.addLessonHardCode(Lessons.RUSSIAN, class5a);        
        teacher1.addLessonHardCode(Lessons.RUSSIAN, class5b);
        teacher1.addLessonHardCode(Lessons.MATHEMATICS, class5a);
        teacher1.addLessonHardCode(Lessons.MATHEMATICS, class5b);
        
        teacher2.addLessonHardCode(Lessons.MATHEMATICS, class5c);        
        teacher2.addLessonHardCode(Lessons.RUSSIAN, class5c);        
        
        teacher3.addLessonHardCode(Lessons.BIOLOGY, class5a);
        teacher3.addLessonHardCode(Lessons.BIOLOGY, class5b);
        teacher3.addLessonHardCode(Lessons.BIOLOGY, class5c);
        
        teacher1.addFreeDay(DayOfWeek.MONDAY);
        teacher2.addFreeDay(DayOfWeek.TUESDAY);
        teacher3.addFreeDay(DayOfWeek.WEDNESDAY);
        
        Mixer.addClass(class5a);
        Mixer.addClass(class5b); 
        Mixer.addClass(class5c);
        //Mixer.addClass(class6b);
        
        Mixer.addTeacher(teacher1);
        Mixer.addTeacher(teacher2);        
        Mixer.addTeacher(teacher3);
        
        Mixer.showTeachersLessonsLoad();
        Mixer.showClassesLessonsLoad();            
        
        
        Mixer.createSchedule();
        System.out.println("------");
        Mixer.showTeachersWeekLoad();
        Mixer.showClassesWeekLoad();
        
    }
}
