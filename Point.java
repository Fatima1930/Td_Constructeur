public class Point {
	private double abscisse;
	private double ordon�e;

	public Point(){
		this.abscisse=0;
		this.ordon�e=0;}
	public Point(double x){
		this.abscisse=x;
		this.ordon�e=x;
	}
	public Point (double x, double y){
		this.abscisse=x;
		this.ordon�e=y;
	}
	public double getAbscisse(){
		return this.abscisse;
	}
	public double getOrdon�e(){
		return this.ordon�e;
	}
	public String toString(){
		return "(" + abscisse+ ","+ ordon�e +")";
	}
	public Point Symetrie(){
		return new Point(-abscisse,ordon�e);
	}

}
