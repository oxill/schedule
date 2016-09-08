package schedule;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Ilya on 31.08.2016.
 */
class Teacher extends Creator {    
    private EnumMap<Week, List<Class>> weekAndList;
    private List<Class> classes;

    Teacher(String fullName) {
        super(fullName);
        this.classes = new ArrayList<>();
        weekAndList = new EnumMap<>(Week.class);
        for (Week w : Week.values()) {
            weekAndList.put(w, classes);
        }
    }

    public Teacher(String fullName, int load) {
        super(fullName);
        
    }
    
    

    public EnumMap<Week, List<Class>> getWeekAndList() {
        return weekAndList;
    }

    public void addClass(Week week, Class c) {
        classes.add(c);
        weekAndList.put(week, classes);
    }
    
    void showWeekAndList() {
        System.out.print("Week and list ");
        for (Map.Entry<Week, List<Class>> entry : weekAndList.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("size teacher" + entry.getValue().size());
            for (Class c : entry.getValue()) {
                System.out.println(c.getFullName());
            }
        }
    }
    
}
