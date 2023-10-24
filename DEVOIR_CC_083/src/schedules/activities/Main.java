package schedules.activities;

public class Main{
    public static void main(String[] args){
        Activity act = new Activity("Aller à l'université",15);
        Activity act2 = new Activity("Faire du sport", 5);

        System.out.println("Première activité : "+act.getDescription()+" et dure "+act.getDuration()+" min");

    }
}