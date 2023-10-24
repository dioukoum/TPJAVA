package schedules.basictopologicalsort;
import java.util.ArrayList;
import java.util.HashSet;
import schedules.activities.Activity;
import schedules.basicconstraints.PrecedenceConstraint;

public class Main{
    public static void main(String[] argc){
        /*LES DIFFERENTESS ACTIVITES*/
        Activity a1 = new Activity("Se lever",1);
        Activity a2 = new Activity("Aller au travail", 15);
        Activity a3 = new Activity("Prendre une douche", 10);
        Activity a4 = new Activity("Se brosser les dents", 3);
        Activity a5 = new Activity("S'habiller", 2);
        Activity a6 = new Activity("Prendre un petit dejeuner", 15);
        /*LA LISTE DES ACTIVITES */
        HashSet<Activity> listActivity = new HashSet<>();
        listActivity.add(a1);
        listActivity.add(a2);
        listActivity.add(a3);
        listActivity.add(a4);
        listActivity.add(a5);
        listActivity.add(a6);
        /*LES DIFFERENTS CONSTRAINTS */
        PrecedenceConstraint pc1 = new PrecedenceConstraint(a1,a6);
        PrecedenceConstraint pc2 = new PrecedenceConstraint(a1,a5);
        PrecedenceConstraint pc3 = new PrecedenceConstraint(a6,a4);
        PrecedenceConstraint pc4 = new PrecedenceConstraint(a3,a5);
        PrecedenceConstraint pc5 = new PrecedenceConstraint(a4,a2);
        PrecedenceConstraint pc6 = new PrecedenceConstraint(a5,a2);
        PrecedenceConstraint pc7 = new PrecedenceConstraint(a1,a3);
        PrecedenceConstraint pc8 = new PrecedenceConstraint(a6,a2);
        /*LA LISTE DES CONSTRAINTS */
        HashSet<PrecedenceConstraint> listConstraint = new HashSet<>();
        listConstraint.add(pc1);
        listConstraint.add(pc2);
        listConstraint.add(pc3);
        listConstraint.add(pc5);
        listConstraint.add(pc4);
        listConstraint.add(pc5);
        listConstraint.add(pc6);
        listConstraint.add(pc7);
        listConstraint.add(pc8);

        TopologicalSorter ts = new TopologicalSorter();
        //ArrayList<Activity> test = ts.bruteForceSort(listConstraint, listActivity);
        System.out.println(ts.bruteForceSort(listActivity,listConstraint));
        System.out.println(ts.schedule(listActivity,listConstraint,500));
    }
}