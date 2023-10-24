package houses;

public class Villa extends House{
    private int surfaceExterieure;

    public Villa(String address, int surfaceInterieure, int surfaceExterieure){
        super(address, surfaceInterieure);
        this.surfaceExterieure = surfaceExterieure;
    }

    public float price(float prix){
        return (prix * surfaceInterieure) + ((prix/2)*surfaceExterieure);
    }

    public String toString(){
        return "La maison située a l'adresse "+this.getAddress()+" et mesure comme surface interieure "+super.surfaceInterieure+" et surface exterieure "+this.surfaceExterieure;
    }
}