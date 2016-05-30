package BridgePatternDemo;

public class GreenCircle implements drawAPI {
	
	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("I can draw green circle of radius:" + radius + ", x:" + x + ", y:" + y);
	}
}
