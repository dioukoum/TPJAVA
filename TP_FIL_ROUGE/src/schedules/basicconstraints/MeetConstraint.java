package schedules.basicconstraints;
import schedules.activities.Activity;

public class MeetConstraint{
    private Activity first, second;

    public MeetConstraint(Activity act1, Activity act2){
        this.first = act1;
        this.second = act2;
    }

    public Activity getFirst(){
        return this.first;
    }
    public Activity getSecond(){
        return this.second;
    }

    public boolean isSatisfied(int dateA1, int dateA2){
        return dateA1+this.getFirst().getDuration() == dateA2;
    }
}