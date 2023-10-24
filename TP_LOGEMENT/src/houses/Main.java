package houses;
import java.util.HashSet;
public class Main{
    public static void main(String[] argc){
        House h1 = new House("23 avenue de Bruxelles",9);
        House h2 = new House("Campus 1",9);

        h1.price(17);
        h2.price(17);

        HashSet<House> listHouse = new HashSet<>();
        listHouse.add(h1);
        listHouse.add(h2);

        System.out.println(h1.toString());

        Villa ville1 = new Villa("23 avenue de Bruxelles",9,3);

        ville1.price(17);
        System.out.println(ville1.toString());     

        Simulator s1 = new Simulator(4);
        System.out.println(s1.price(listHouse));   
    }
}