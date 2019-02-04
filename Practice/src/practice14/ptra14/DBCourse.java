/*
 * PTra14_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

import practice14.common.Course;

public class DBCourse implements Course {


	public String getCourseName() {
		return "【Eラーニング】DB基礎";
	}

	public String[] getCourseUnit() {
		// TODO 自動生成されたメソッド・スタブ
		String[] units = {"DB基礎","SQL基礎","正規化","SQL応用"};
		return units;
	}

	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */

}
