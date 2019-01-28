/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;


public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero hero = new Hero();
		Slime slime = new Slime();

		hero.setName("勇者");
		slime.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		System.out.println(hero.showParameter());
		System.out.println("---------------------------------------------------------");
		System.out.println(slime.showParameter());
		while(true) {
		System.out.println(hero.getName()+"の攻撃");
		boolean slimeIsDead = slime.damage(hero.attack());
		if(slimeIsDead ==true) {
			System.out.println("勇者はスライムとの戦闘に勝利した");
			break;
		}
		System.out.println(slime.getName()+"の攻撃");
		boolean heroIsDead = hero.damage(slime.attack());
		if(heroIsDead ==true) {
			System.out.println("スライムは勇者との戦闘に勝利した");
			break;
		}

		}

		System.out.println(hero.showParameter());
		System.out.println(slime.showParameter());
		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
