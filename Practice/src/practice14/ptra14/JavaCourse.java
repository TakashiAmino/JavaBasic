/*
 * PTra14_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

import practice14.common.Course;

public class JavaCourse implements Course {

	@Override
	public String getCourseName() {
		return "Eラーニング】Java";
	}

	@Override
	public String[] getCourseUnit() {
		// TODO 自動生成されたメソッド・スタブ
		String[] units = {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
		return units;
	}


	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */

}
