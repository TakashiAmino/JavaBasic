package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if(i>j&&i<=5) {
            	System.out.print("■");
            	continue;
                }
                if(i>=5&&10-i>j) {
                	System.out.print("■");
                	continue;
            }else{
            	System.out.print("□");
            }
        }
            System.out.println();
		}

}
}
