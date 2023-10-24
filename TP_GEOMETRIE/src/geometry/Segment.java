package geometry;

public class Segment{
	private Position a, b;
	public Segment(Position p1, Position p2){
		this.a = p1;
		this.b = p2;
	}
	public Position getA(){
		return this.a;
	}
	public Position getB(){
		return this.b;
	}
	public String getRepresentation(){
		return "Segment de coordonnees("+this.a.getX()+","+this.a.getY()+") et ("+this.b.getX()+","+this.b.getY()+")";
	}
	public double length(){
		return Math.sqrt(Math.pow((this.b.getX()-this.a.getX()),2)+Math.pow((this.b.getY()-this.a.getY()),2));
	}
}
