package labexam;

class Print{
	public void displayMessage1() {
		try {
			Thread.sleep(1000);
			System.out.println("JAVA IS HOT");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void displayMessage2() {
		try {
			Thread.sleep(1000);
			System.out.println("JAVA IS AROMATIC");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public void displayMessage3() {
		try {
			Thread.sleep(1000);
			System.out.println("JAVA IS INVIGORATING");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class Thread1 extends Thread{
	Print p;
	Thread1(){
		p = new Print();
	}
	@Override
	public void run() {
		p.displayMessage1();
		p.displayMessage2();
		p.displayMessage3();
	}
}

class Thread2 extends Thread{
	Print p2;
	Thread2(){
		p2 = new Print();
	}
	@Override
	public void run() {
		p2.displayMessage1();
		p2.displayMessage2();
		p2.displayMessage3();
	}
}
public class Threading {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
	}

}
