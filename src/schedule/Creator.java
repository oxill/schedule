package schedule;

import java.io.IOException;

/**
 * Created by Ilya on 01.09.2016.
 */
interface Creator {
    void addLesson() throws IOException;
    void showLessons();
    void showLoad();
}
