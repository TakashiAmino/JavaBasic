package practice03;


public class Practice8 {
	public static void main(String[] args) {


		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("1~9までの数字を入力してください");

		String line = scanner.nextLine();

		int num = Integer.parseInt(line);

		if (num>=1 && num<=3) {
			System.out.println("おはようございます。");
		}else if (num>=4 && num<=6) {
			System.out.println("こんにちは。");
		}else if(num<=9 && num>=7){
			System.out.println("こんばんは。");
		}


	}
}