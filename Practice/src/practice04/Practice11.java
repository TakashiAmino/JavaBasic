package practice04;


public class Practice11 {
	public static void main(String[] args) {
		
		int sum = 0;

		System.out.println("入力された数値を合計します。1から9の数値を入力して下さい。0を入力したら計算結果を表示します。");

		while (1==1) {
			int num = new java.util.Scanner(System.in).nextInt();

			if(num<=9&&num>=1) {
				sum += num;
				continue;
			}

			if(num==0) {
				break;
			}
			else {
				System.out.println("0から9の数値を入力して下さい。");
			}
		}
		System.out.println("合計値は"+sum+"です。");
	}
}