package geometry;

public class Main{
	
		public static void main(String[] args){
			
			System.out.println("----POSITION-----");
			Position p = new Position(3, 4);
			Position pt;
			
			System.out.println(p.getX() + "," + p.getY());
			System.out.println(p.getRepresentation());
			pt=p.symmetricX();
			System.out.println(pt.getRepresentation());
			p.symmetricX();
			System.out.println(p.getRepresentation());
			p.translate(5,10);
			System.out.println(p.getRepresentation());
			
			Position p1 = new Position(3,4);
			Position p2 = new Position(7,7);
			
			Segment s = new Segment(p1, p2);
			System.out.println(s.getRepresentation());
			System.out.println("Sa longueur est: "+s.length());
		}
	
	}
