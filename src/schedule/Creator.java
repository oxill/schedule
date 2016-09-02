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
    private EnumMap<Lessons, Integer> enumMap;

    Creator(String fullName) {
        this.fullName = fullName;
        this.enumMap = new EnumMap<>(Lessons.class);
    }

    String getFullName() {
        return fullName;
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
                    enumMap.put(lesson, load);
                }
            }

            numberOfLesson = Integer.parseInt(reader.readLine());
        }
    }

    void showLessonsAndLoad() {
        System.out.println("Lessons and load");

        for (Map.Entry<Lessons, Integer> entry : enumMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
