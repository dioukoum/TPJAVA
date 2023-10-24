package schedules.basicconstraints;
import schedules.activities.Activity;

public class Main{
    public static void main(String[] main){
        //Soient a1, a2, a3, a4 des activités de type Activity
        Activity a1 = new Activity("Aller à l'université",1);
        Activity a2 = new Activity("Faire du sport", 10);

        Activity a3 = new Activity("Aller à l'université",15);
        Activity a4 = new Activity("Attacher son velo", 1);

        //Soient pc1, pc2 des contraintes de type PrecendenceConstraint
        PrecedenceConstraint pc1 = new PrecedenceConstraint(a1,a2);
        PrecedenceConstraint pc2 = new PrecedenceConstraint(a3,a4);
        pc1.isSatisfied(0, 0);
        pc2.isSatisfied(0, 0);

        //Soient mc1, mc2 des contraintes de type MeetConstraint
        MeetConstraint mc1 = new MeetConstraint(a1,a2);
        MeetConstraint mc2 = new MeetConstraint(a3,a4);
        mc1.isSatisfied(0, 0);
        mc2.isSatisfied(0, 0);  

    }
}