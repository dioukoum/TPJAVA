package schedules.factoredconstraints;
import schedules.activities.Activity;

public class PrecedenceConstraint extends BinaryConstraint{

    public PrecedenceConstraint(Activity a1, Activity a2){
        super(a1,a2);   
    }
   
   @Override
    public boolean isSatisfied(int dateA1, int dateA2){
        return dateA1+this.getFirst().getDuration() <= dateA2;
    }
}