package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します


		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println();

		String line = scanner.nextLine();

		Book[] results= FileReaderClass.readBookDataFile();
		for(int i = 0;i<results.length;i++) {

			if( results[i].title.contains(line)) {
				System.out.println("-------------------------------------------------");
				System.out.println(results[i].dispBookInfo());
				//オブジェクト指向設計実践ガイド
			}

		}
		System.out.println("-------------------------------------------------");


		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください

	}
}
