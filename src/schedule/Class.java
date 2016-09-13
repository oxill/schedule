package schedule;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ilya on 01.09.2016.
 */
class Class extends Creator {
    private EnumMap<Week, List<Lessons>> weekAndList;
    private List<Teacher> teachers;    

    public Class(int classNumber, String classLetter) {
        super(classNumber, classLetter);
        weekAndList = new EnumMap<>(Week.class);
        
        for (Week w : Week.values()) {
            weekAndList.put(w, new ArrayList<Lessons>());
        }
    }
    
    
    
    public EnumMap<Week, List<Lessons>> getWeekAndList() {
        return weekAndList;
    }

    public void addTeacher(Week week, Lessons lesson) {
        List<Lessons> list = weekAndList.get(week);
        list.add(lesson);
        //teachers.add(t);
        weekAndList.put(week, list);        
    }
    
    void showWeekAndList() {
        System.out.println("Week and list");
        for (Map.Entry<Week, List<Lessons>> entry : weekAndList.entrySet()) {
            System.out.print(entry.getKey() + " ");
            for (Lessons lesson : entry.getValue()) {
                System.out.print(lesson.name() + " ");
            }
            System.out.println("");
        }
    }
}
