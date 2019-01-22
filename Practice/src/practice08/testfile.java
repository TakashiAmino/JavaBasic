package practice08;

public class testfile{
	public static void main(String[] args) {

		whassup("john");

		String hifives = whassup2("john");
		System.out.println(hifives);
		whassup("John","Yoko");

}
	public static void whassup(String name) {
		System.out.println("whassup,"+name);

	}
	public static String whassup2(String name) {
		return  "Whassup,"+name;
	}
	public static void whassup(String name,String name2) {
		System.out.println("whassup,"+name+" and "+name2);

	}
}

