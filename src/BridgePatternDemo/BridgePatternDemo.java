package BridgePatternDemo;

public class BridgePatternDemo {
	public static void main(String[] args){
		Shape redCircle = new Circle(70, 200, 10, new RedCircle());
	      Shape greenCircle = new Circle(55, 15, 5, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	}
}
