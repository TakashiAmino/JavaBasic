/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import java.text.SimpleDateFormat;
import java.util.Date;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {

		Room room = new Java2Month();

		String[] array = ((Java2Month) room).getCurriculum();

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください


		// 取得したカリキュラム情報を全て出力してください
		for(int i =0;i < array.length;i++) {

		System.out.println(array[i]);
		}
		Date date = new Date();
		SimpleDateFormat f = new SimpleDateFormat();
		String dateStr = f.format(date);
		System.out.println(dateStr);




	}
}
