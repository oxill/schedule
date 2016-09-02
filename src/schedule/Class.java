package schedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ilya on 01.09.2016.
 */
class Class implements Creator {
    private String fullName;
    private int load;
    private Set<Lessons> set;

    public Class(String fullName, int load) {
        this.fullName = fullName;
        this.load = load;
        this.set = new HashSet<>();
    }

    String getFullName() {
        return fullName;
    }

    @Override
    public void addLesson() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter class lesson");
        for (Lessons lessons :
                Lessons.values()) {
            System.out.println(lessons);
        }

        System.out.println("For exit " + Lessons.values().length);
        int numberOfLesson = Integer.parseInt(reader.readLine());

        while (numberOfLesson != Lessons.values().length) {
            for (Lessons lesson:
                    Lessons.values()) {
                if (lesson.ordinal() == numberOfLesson)
                    set.add(lesson);
            }

            numberOfLesson = Integer.parseInt(reader.readLine());
        }
    }

    @Override
    public void showLessons() {
        System.out.println("Class lessons ");
        for (Lessons lessons :
                Lessons.values()) {
            System.out.println(lessons);
        }
    }

    @Override
    public void showLoad() {
        System.out.println("class load " + load);
    }
}
