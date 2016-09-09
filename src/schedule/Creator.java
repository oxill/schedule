package schedule;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumMap;
import java.util.Map;

/**
 * Created by Ilya on 01.09.2016.
 */
class Creator {
    private String fullName;
    private EnumMap<Lessons, Integer> lessonAndLoad; // <урок, кол-во часов данного урока>
    private int mainLoad;

    Creator(String fullName) {
        this.fullName = fullName;
        this.lessonAndLoad = new EnumMap<>(Lessons.class);
        this.mainLoad = 0;
    }

    String getFullName() {
        return fullName;
    }

    public int getMainLoad() {
        return mainLoad;
    }   

    public EnumMap<Lessons, Integer> getLessonAndLoad() {
        return lessonAndLoad;
    }    
    
    protected void reduceMainLoad() {
        this.mainLoad--;
    }
    
    protected void reduceLoadForLesson(Lessons lesson) {
        int load = this.lessonAndLoad.get(lesson) - 1;
        this.lessonAndLoad.put(lesson, load);
    }

    void addLesson() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lesson");
        for (Lessons lessons :
                Lessons.values()) {
            System.out.println(lessons);
        }

        System.out.println("For exit " + Lessons.values().length);
        int numberOfLesson = Integer.parseInt(reader.readLine());

        while (numberOfLesson != Lessons.values().length) {
            for (Lessons lesson:
                    Lessons.values()) {
                if (lesson.ordinal() == numberOfLesson) {
                    System.out.println("Enter load");
                    int load = Integer.parseInt(reader.readLine());
                    lessonAndLoad.put(lesson, load);
                    this.mainLoad += load;
                }
            }

            numberOfLesson = Integer.parseInt(reader.readLine());
        }
    }    
    
    void addLessonHardCode(Lessons l, int load) {
        this.lessonAndLoad.put(l, load);
        this.mainLoad += load;
    }
    
    /*void addLessonHardCode() {
        //nothing
    }*/
    

    void showLessonsAndLoad() {
        System.out.println("Lessons and load");

        for (Map.Entry<Lessons, Integer> entry : lessonAndLoad.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Main load " + this.mainLoad);
    }        
}
