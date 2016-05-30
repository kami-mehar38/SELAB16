package BridgePatternDemo;

public class Circle extends Shape {

	private int radius, x, y;
	public Circle(int radius, int x, int y, drawAPI drawApi) {
		super(drawApi);
		// TODO Auto-generated constructor stub
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawApi.drawCircle(radius, x, y);
	}

}
