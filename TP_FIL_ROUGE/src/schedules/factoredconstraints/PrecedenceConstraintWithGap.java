package schedules.factoredconstraints;
import schedules.activities.Activity;

public class PrecedenceConstraintWithGap extends PrecedenceConstraint{
    private int delaiMin, delaiMax;

    public PrecedenceConstraintWithGap(Activity a1, Activity a2, int delaiMin, int delaiMax){
        super(a1, a2);
        this.delaiMin = delaiMin;
        this.delaiMax = delaiMax;
    }

    public boolean isSatisfied(int dateA1, int dateA2){
        boolean testMin = dateA2 - (dateA1+this.getFirst().getDuration()) >= delaiMin;
        boolean testMax = dateA2 - (dateA1+this.getFirst().getDuration()) <= delaiMax;

        return (testMin && testMax);
    }
}