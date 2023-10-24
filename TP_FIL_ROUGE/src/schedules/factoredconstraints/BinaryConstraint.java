package schedules.factoredconstraints;
import schedules.activities.Activity;
public abstract class BinaryConstraint{
    protected Activity a1, a2;
    public BinaryConstraint(Activity a1, Activity a2){
        this.a1 = a1;
        this.a2 = a2;
    }

    public Activity getFirst(){
        return this.a1;
    }
    public Activity getSecond(){
        return this.a2;
    }

    public abstract boolean isSatisfied(int dateA1, int dateA2);
}