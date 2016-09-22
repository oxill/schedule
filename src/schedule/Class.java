package schedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ilya on 01.09.2016.
 */
class Class {
    private EnumMap<DayOfWeek, List<Lessons>> weekAndList; 
    private EnumMap<DayOfWeek, List<Teacher>> weekTeachers; 
    private EnumMap<Lessons, Double> lessonAndLoad; // <урок, кол-во часов данного урока>
    private int mainLoad;
    private int classNumber;
    private String classLetter;
    private int people;
    private Lessons [] arrLessons;
   
    
    Class (int classNumber, String classLetter, int people) {
        this.classNumber = classNumber;
        this.classLetter = classLetter;
        this.people = people;
        this.lessonAndLoad = new EnumMap<>(Lessons.class);
        this.mainLoad = 0;
        this.weekAndList = new EnumMap<>(DayOfWeek.class);
        this.weekTeachers = new EnumMap<>(DayOfWeek.class);
        this.arrLessons = new Lessons[6];
        
        /*for (DayOfWeek w : DayOfWeek.values()) {
            weekAndList.put(w, new ArrayList<Lessons>());
        }*/
    }
    
    public void fillArrayLessons(Lessons lesson) {
        
    }
    
    /*public int getEmptyPosition() {
        if (arrLessons.length != 0) {
            
        }
    }*/
    
    public boolean isDivideOnPart() {
        return people > 24;
    }
    
    String getFullNameClass() {
        return classNumber + classLetter;
    }

    public int getClassNumber() {
        return classNumber;
    }        

    public int getMainLoad() {
        return mainLoad;
    }           
    
    public EnumMap<DayOfWeek, List<Lessons>> getWeekAndList() {
        return weekAndList;
    }

    public void addLessonToday(DayOfWeek day, Lessons lesson) {        
        List<Lessons> list = weekAndList.get(day);
        if (list == null) 
            list = new ArrayList<>();                
        list.add(lesson);        
        weekAndList.put(day, list);                          
    }
    
    public void addTeacherToday(DayOfWeek day, Teacher teacher) {
        List<Teacher> list = weekTeachers.get(day);
        if (list == null) 
            list = new ArrayList<>();                
        list.add(teacher);        
        weekTeachers.put(day, list);  
    }
    
    public int getClassLessonCount(DayOfWeek day) {
        List<Lessons> list = weekAndList.get(day);
        if (list == null)
            return 0;
        else 
            return list.size();
    }
    
    void showWeekAndList() {
        System.out.println("Week and list");
        for (Map.Entry<DayOfWeek, List<Lessons>> entry : weekAndList.entrySet()) {
            System.out.print(entry.getKey() + " ");
            for (Lessons lesson : entry.getValue()) {
                System.out.print(lesson.name() + " ");
            }
            System.out.println("");
        }
        for (Map.Entry<DayOfWeek, List<Teacher>> entry : weekTeachers.entrySet()) {
            System.out.print(entry.getKey() + " ");
            for (Teacher teacher : entry.getValue()) {
                System.out.print(teacher.getFullNameTeacher() + " ");
            }
            System.out.println("");
        }
        
    }
    
    public EnumMap<Lessons, Double> getMapLessonAndLoad() {
        return lessonAndLoad;
    }
    
    public Double getlessonLoad(Lessons l) {
        return lessonAndLoad.get(l);
    }
    
    protected void reduceMainLoad() {
        this.mainLoad--;
    }
    
    protected void reduceLoadForLesson(Lessons lesson) {
        double load = this.lessonAndLoad.get(lesson) - 1;
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
                    double load = Integer.parseInt(reader.readLine());
                    lessonAndLoad.put(lesson, load);
                    this.mainLoad += load;
                }
            }

            numberOfLesson = Integer.parseInt(reader.readLine());
        }
    }    
    
    void addLessonHardCode(Lessons l, double load) {
        this.lessonAndLoad.put(l, load);
        this.mainLoad += load;
    }
    
    void showLessonsAndLoad() {        
        for (Map.Entry<Lessons, Double> entry : lessonAndLoad.entrySet()) {
            if (entry.getValue() != 0)                             
                System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        System.out.println("Main load " + this.mainLoad);
    }  
}
