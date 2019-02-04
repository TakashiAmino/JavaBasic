package Practice.practice20;

public class Lion implements Animal{

	@Override
	public void eat() {
	System.out.println("ライオンが肉を食べました");
	}

	@Override
	public void run() {
	System.out.println("ライオンが走りました");
	}

}