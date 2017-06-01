package entite;

public abstract class Entite {

	public enum Direction {
		NORD, SUD, EST, OUEST;
	}

	private int x;
	private int y;
	private Direction d;

	public void Position(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void setD(Direction d){
		this.d = d;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public Direction getD() {
		return this.d;
	}
}
