package ObserverPatternDemo;

public class binaryObserver extends Observer {

	public binaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	protected void update() {
		System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
	}

}
