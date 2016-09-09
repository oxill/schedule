package schedule;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ilya on 01.09.2016.
 */
class Class extends Creator {
    private EnumMap<Week, List<Teacher>> weekAndList;
    private List<Teacher> teachers;

    Class(String fullName) {
        super(fullName);
        weekAndList = new EnumMap<>(Week.class);
        /*teachers = new ArrayList<>();
        for (Week w : Week.values()) {
            weekAndList.put(w, teachers);
        }*/
        for (Week w : Week.values()) {
            weekAndList.put(w, new ArrayList<Teacher>());
        }
        
    }
    
    public EnumMap<Week, List<Teacher>> getWeekAndList() {
        return weekAndList;
    }

    public void addTeacher(Week week, Teacher t) {
        List<Teacher> list = weekAndList.get(week);
        list.add(t);
        //teachers.add(t);
        weekAndList.put(week, list);        
    }
    
    void showWeekAndList() {
        System.out.println("Week and list");
        for (Map.Entry<Week, List<Teacher>> entry : weekAndList.entrySet()) {
            System.out.print(entry.getKey() + " ");
            for (Teacher teacher : entry.getValue()) {
                System.out.print(teacher.getFullName() + " ");
            }
            System.out.println("");
        }
    }
}
