package schedules.basicconstraints;
import schedules.activities.Activity;

public class Main{
    public static void main(String[] main){
        Activity a1 = new Activity("Aller à l'université",1);
        Activity a2 = new Activity("Faire du sport", 10);

        Activity a3 = new Activity("Aller à l'université",15);
        Activity a4 = new Activity("Attacher son velo", 1);

        PrecedenceConstraint pc = new PrecedenceConstraint(a1,a2);
        PrecedenceConstraint pc2 = new PrecedenceConstraint(a3,a4);
        pc.isSatisfied(0, 0);
        pc2.isSatisfied(0, 0);

        MeetConstraint mc = new MeetConstraint(a1,a2);
        MeetConstraint mc2 = new MeetConstraint(a3,a4);
        mc.isSatisfied(0, 0);
        mc2.isSatisfied(0, 0);  

        PrecedenceConstraintWithGap pcwg = new PrecedenceConstraintWithGap(a1,a2,0,10);
        PrecedenceConstraint pcwg2 = new PrecedenceConstraintWithGap(a3,a4,2,20);
        //pcwg.isSatisfied(0, 0);
        //pcwg2.isSatisfied(0, 0);            
        System.out.println("La satisfaction de la methode est : "+pcwg.isSatisfied(500, 523));
        System.out.println("La satisfaction de la methode est : "+pc2.isSatisfied(0, 0));
    }
}