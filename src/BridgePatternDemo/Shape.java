package BridgePatternDemo;

public abstract class Shape {
	protected drawAPI drawApi;
	public Shape(drawAPI drawApi){
		this.drawApi = drawApi;
	}
	public abstract void draw();
}
