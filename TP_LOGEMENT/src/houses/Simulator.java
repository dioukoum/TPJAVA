package houses;
import java.util.HashSet;
public class Simulator{
    private float prix;

    public Simulator(float prix){
        this.prix = prix;
    }

     public float price(House house){
        
        return house.price(this.prix);
    }

    public float price(HashSet<House> house){
        float somme = 0;
        for(House h: house){
            somme += h.price(this.prix);
        }
        return somme;
    }
}