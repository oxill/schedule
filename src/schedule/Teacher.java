package schedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumMap;
import java.util.Map;

/**
 * Created by Ilya on 31.08.2016.
 */
class Teacher implements Creator {
    private String fullName;
    private EnumMap<Lessons, Integer> enumMap;

    Teacher(String fullName) {
        this.fullName = fullName;
        this.enumMap = new EnumMap<Lessons, Integer>(Lessons.class);
    }

    String getFullName() {
        return fullName;
    }

    @Override
    public void addLesson() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter teacher lesson");
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
                    enumMap.put(lesson, load);
                }
            }

            numberOfLesson = Integer.parseInt(reader.readLine());
        }
    }

    @Override
    public void showLessons() {
        System.out.println("Teacher lessons ");
        for (Lessons lessons :
                Lessons.values()) {
            System.out.println(lessons);
        }
    }

    @Override
    public void showLoad() {
        System.out.println("Teacher load");

        for (Map.Entry<Lessons, Integer> entry : enumMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
