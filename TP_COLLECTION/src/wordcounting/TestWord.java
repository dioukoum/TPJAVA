package wordcounting;
import java.util.ArrayList;

public class TestWord{
    public static void main(String[] args){
        WordCounter wc = new WordCounter(false);
        ArrayList<String> al = new ArrayList<>();
        al.add("Le");
        al.add("cours");
        al.add("le");
        al.add("passionne");
        al.add("le");

        System.out.println("ArrayList : "+al);
        System.out.println("HashSet : "+wc.words(al));
        System.out.println("HashMap : "+wc.count(al));
    }
}