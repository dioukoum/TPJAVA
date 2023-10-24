package wordcounting;
import java.util.*;

public class WordCounter{
	private boolean bool;
	
	public WordCounter(boolean bool){
		this.bool = bool;
	}
	
	public HashSet<String> words(ArrayList<String> phrase){
		HashSet<String> hashMot = new HashSet<>();

		for(String i:phrase){
			if(bool){
				hashMot.add(i);
			}else{
				hashMot.add(i.toLowerCase());
			}
		}
		return hashMot;
	}

	public HashMap<String, Integer> count(ArrayList<String> phrase){
		HashMap<String, Integer> mp = new HashMap<>();
		ArrayList<String> phraseMiniscule = new ArrayList<>();
		if(bool){
				for(String i:phrase){
					phraseMiniscule.add(i);
				}
			}
			else{
				for(String i:phrase){
					phraseMiniscule.add(i.toLowerCase());
				}
			}
		for(String i:phraseMiniscule){
			if(!mp.containsKey(i)){
				mp.put(i,1);
			} else{
				mp.put(i, mp.get(i)+1);
			}
		}
		return mp;
	}
	
}
