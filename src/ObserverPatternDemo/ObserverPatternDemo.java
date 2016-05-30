package ObserverPatternDemo;

public class ObserverPatternDemo {
	public static void main(String[] args){
		Subject subject = new Subject();
		new binaryObserver(subject);
		subject.setState(10);
		
	}
}
