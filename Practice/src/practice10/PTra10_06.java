package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car nissan  = new Car();
		nissan.color     = "白";
		nissan.serialNo  = 001;
		nissan.gasoline  = 20;

		Car toyota  = new Car();
		toyota.color     = "黒";
		toyota.serialNo  = 002;
		toyota.gasoline  = 30;

		Car matsuda = new Car();
		matsuda.color    = "銀";
		matsuda.serialNo = 003;
		matsuda.gasoline = 40;

		final int distance = 200;
		Car[]cars = {nissan,toyota,matsuda};

		for(int i=0; i<cars.length;i++) {

		int over = 0;
				int n = 0;
				while (true) {
					int accel = cars[i].run();
					if (accel == -1) {
						System.out.println();
						System.out.println((cars[i].gasoline+n)+"リットルのガソリンを積み出発した"+cars[i].color+"色の"+cars[i].serialNo+"号車は、"+distance+"メートル先の目的地に到達できませんでした。\nガソリンは底をつきました。");
						break;
					}
					over += accel;
					n++;
					if(n==1) {
						System.out.println("--------------------------------------------------------");
						System.out.println(cars[i].serialNo+"号車は目的地に向け出発しました。");
						System.out.println("--------------------------------------------------------");
						continue;
					}
					System.out.println(n+"時間後、 "+cars[i].serialNo+"号車は"+over+"メートル地点に到達しました");
					if (over >= distance) {
						System.out.println();
						System.out.println((cars[i].gasoline+n)+"リットルのガソリンを積み出発した"+cars[i].color+"色の"+cars[i].serialNo+"号車は、"+distance+"メートル先の目的地まで" + n + "時間かかりました。\n残りのガソリンは" + cars[i].gasoline + "リットルです");
						break;
					}
				}
		}


	}
}
