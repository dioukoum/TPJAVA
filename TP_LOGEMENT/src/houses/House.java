package houses;

public class House{
    protected String address;
    protected int surfaceInterieure;

    public House(String address, int surfaceInterieure){
        this.address = address;
        this.surfaceInterieure = surfaceInterieure;
    }

    public String getAddress(){
        return this.address;
    }

    public float price(float prix){
        return prix * this.surfaceInterieure;
    }

    
    public String toString(){
        return "La maison située a l'adresse "+this.getAddress()+" et mesure "+this.surfaceInterieure;
    }
}