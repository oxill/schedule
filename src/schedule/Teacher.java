package schedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Ilya on 31.08.2016.
 */
class Teacher {    
    private String fullName;
    private EnumMap<Lessons, Integer> lessonAndLoad; // <урок, кол-во часов данного урока>
    private EnumMap<Lessons, List<Class>> lessonAndClass;
    private int mainLoad;        
    private EnumMap<DayOfWeek, List<Class>> weekAndList;    
    private List<Class> classes;
    private DayOfWeek day;

    Teacher(String fullName) {
        this.fullName = fullName;
        this.lessonAndLoad = new EnumMap<>(Lessons.class);
        this.lessonAndClass = new EnumMap<>(Lessons.class);
        this.mainLoad = 0;        
        this.weekAndList = new EnumMap<>(DayOfWeek.class);
        this.classes = new ArrayList<>();
        //this.day = null;
       
        for (DayOfWeek w : DayOfWeek.values()) {
            weekAndList.put(w, new ArrayList<Class>());
        }
        
        /*for (Lessons l : Lessons.values()) {
            lessonAndClass.put(l, new ArrayList<Class>());
        }*/
    }
    
    String getFullNameTeacher() {
        return fullName;
    }      

    public int getMainLoad() {
        return mainLoad;
    }

    public EnumMap<Lessons, List<Class>> getLessonAndClass() {
        return lessonAndClass;
    }
    
    public boolean hasClass(Lessons l, Class c) {
        if (lessonAndClass.get(l) != null) {
            return lessonAndClass.get(l).contains(c);
        }
        return false;
    }

    public EnumMap<DayOfWeek, List<Class>> getWeekAndList() {
        return weekAndList;
    }
    
    private void addClass(Lessons l, Class c) {
        //List<Class> classes = lessonAndClass.get(l);        
        classes.add(c);
        this.lessonAndClass.put(l, classes);
    }
    
    public void addFreeDay(DayOfWeek day) {
        this.day = day;
    }
    
    public boolean isFreeDay(DayOfWeek day) {
        return this.day.equals(day);
    }
            

    public void addClassToday(DayOfWeek day, Class c) {        
        List<Class> list = weekAndList.get(day);
        list.add(c);
        //classes.add(c);
        weekAndList.put(day, list);
    }
    
    void showWeekAndList() {
        System.out.println("Week and list");
        for (Map.Entry<DayOfWeek, List<Class>> entry : weekAndList.entrySet()) {
            System.out.print(entry.getKey() + " ");
            //System.out.println("size teacher" + entry.getValue().size());
            for (Class c : entry.getValue()) {
                System.out.print(c.getFullNameClass() + " ");
            }
            System.out.println("");
        }
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

    void addLessonFromKeyboard() throws IOException {
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
    
    void addLessonHardCode(Lessons l, Class c) {
        int load = 0;
        if (this.lessonAndLoad.get(l) != null) {
            load = this.lessonAndLoad.get(l);        
        }
        int prevLoad = load;
        load += c.getlessonLoad(l);
        this.lessonAndLoad.put(l, load); // добавляем к учителю урок + нагрузку
        this.mainLoad += load - prevLoad;
        addClass(l, c); // связываем урок с классом
    }
            
    void showLessonsAndLoad() {
        System.out.println("Lessons and load");

        for (Map.Entry<Lessons, Integer> entry : lessonAndLoad.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Main load " + this.mainLoad);
    }
    
    /*void showInfo() {
        System.out.println("Info");
        for (Map.Entry<Lessons, List<Class>> entry : lessonAndClass.entrySet()) {
            Lessons lesson = entry.getKey();            
            System.out.println(lesson);
            for (Class c : entry.getValue()) {
                System.out.println(c.getlessonLoad(lesson));
            }
        }        
    }*/
    
}
