package practice03;


public class Practice9 {
	public static void main(String[] args) {


		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("1から12の好きな数値を入力して下さい。");

		String line = scanner.nextLine();

		int month = Integer.parseInt(line);

		switch(month) {

		case 1:
			System.out.println(month+"月／January");
			break;
		case 2:
			System.out.println(month+"月／February");
			break;
		case 3:
			System.out.println(month+"月／March");
			break;
		case 4:
			System.out.println(month+"月／April");
			break;
		case 5:
			System.out.println(month+"月／May");
			break;
		case 6:
			System.out.println(month+"月／June");
			break;
		case 7:
			System.out.println(month+"月／July");
			break;
		case 8:
			System.out.println(month+"月／August");
			break;
		case 9:
			System.out.println(month+"月／September");
			break;
		case 10:
			System.out.println(month+"月／October");
			break;
		case 11:
			System.out.println(month+"月／November");
			break;
		case 12:
			System.out.println(month+"月／December");
			break;
		default:
			System.out.println("1から12の数値を入力して下さい。");
		}
		System.out.println("ありがとうございました。");
	}
}