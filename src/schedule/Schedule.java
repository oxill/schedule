package schedule;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ilya on 31.08.2016.
 */
public class Schedule {
    public static void main(String[] args) throws IOException {       
        Teacher teacher1 = new Teacher("teacher1");
        Teacher teacher2 = new Teacher("teacher2");
        Class class1 = new Class("class1");
        //Class aClass2 = new Class("class2");*/
        
        /*class1.addLesson();
        teacher1.addLesson();
        teacher2.addLesson();*/
        
        class1.addLessonHardCode();
        teacher1.addLessonHardCodeTeacher(Lessons.RUS, 1);
        teacher2.addLessonHardCodeTeacher(Lessons.MATH, 2);
        //teacher1.addLesson();
        //teacher2.addLesson();
        Mixer.addClass(class1);
        Mixer.addTeacher(teacher1);
        Mixer.addTeacher(teacher2);        
        Mixer.showTeachersLL();
        Mixer.showClassesLL();
        Mixer.showTeachersWL();
        Mixer.showClassesWL();
        
        Mixer.scheduleForEveryDay();
        
        
    }
}
