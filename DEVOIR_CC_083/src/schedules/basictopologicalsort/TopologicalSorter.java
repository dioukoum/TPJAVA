package schedules.basictopologicalsort;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import schedules.activities.Activity;
import schedules.basicconstraints.PrecedenceConstraint;

public class TopologicalSorter{

    public TopologicalSorter(){

    }
    
    public ArrayList<Activity> bruteForceSort(HashSet<Activity> ac,HashSet<PrecedenceConstraint>pc){
        
        ArrayList<Activity> res = new ArrayList<>();
        
        HashSet<Activity> copy = new HashSet<>(ac);
        
        while(!copy.isEmpty()){
            Activity o = ordonnanceur(copy,res,pc);
            if(o==null){
                return null;
            } else{
                res.add(o);
                copy.remove(o);
            }
        }

        return res;

    }

    private Activity ordonnanceur(HashSet<Activity>copy, ArrayList<Activity> res, HashSet<PrecedenceConstraint> pc ){
    for(Activity el: copy){
        boolean ok = true;
        for(PrecedenceConstraint c : pc){
            if(el == c.getSecond() && !res.contains(c.getFirst())){
                ok = false;
                break;
            }
        }
        if(ok) return el;
    }
    return null;
}

    public HashMap<Activity, Integer>schedule(HashSet<Activity> ac, HashSet<PrecedenceConstraint>pc,int date){

        HashMap<Activity, Integer> scheduleMap = new HashMap<>();
        ArrayList<Activity> listActivity = new ArrayList<>();
        listActivity = bruteForceSort(ac,pc);

        int acc = date;

        if(listActivity != null && acc >=0){
            for(Activity i: listActivity){
                scheduleMap.put(i,acc);
                acc += i.getDuration(); 
            }
            return scheduleMap;
        } else{
            return null;
        }
    }
}

