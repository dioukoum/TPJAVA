package geometry;

public class Position{
	
	private int x, y;
	
	public Position(int _x, int _y){
		this.x = _x;
		this.y = _y;
	}
	public Position(){
		
	}
		
	public int getX(){
		return this.x;
	}
			
	public int getY(){
		return this.y;
	}
	public String getRepresentation(){
		return "x="+this.x+" et y="+this.y;
	}
	public Position symmetricX(){
		return new Position(this.x, -this.y);
	}
	public void translate(int a, int b){
		this.x += a;
		this.y += b; 
	}
}
