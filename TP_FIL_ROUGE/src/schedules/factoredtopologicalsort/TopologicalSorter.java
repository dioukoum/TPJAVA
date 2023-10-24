package schedules.factoredtopologicalsort;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import schedules.activities.Activity;
import schedules.factoredconstraints.PrecedenceConstraint;

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
        HashMap<Activity, Integer> sch = new HashMap<>();
        ArrayList<Activity> liste_activite = new ArrayList<>();

        liste_activite = bruteForceSort(ac,pc);
        if(liste_activite != null){
            int somme = date;
            for(Activity i: liste_activite){
                sch.put(i,somme);
                somme += i.getDuration(); 
            }
            return sch;
        } else{
            return null;
        }
    }
}

