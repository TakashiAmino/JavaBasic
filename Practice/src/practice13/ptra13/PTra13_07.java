/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		SuperHero yusha = new SuperHero();
		Slime slime = new Slime();
		yusha.setName("勇者（装備あり）");
		slime.setName("スライム");


		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		Item konbou = new Item("こんぼう",4);

		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
		yusha.setEquipment(konbou);
		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		System.out.println(yusha.showParameter());
		System.out.println("---------------------------------------------------------");
		System.out.println(slime.showParameter());
		while(true) {
		System.out.println(yusha.getName()+"の攻撃");
		boolean slimeIsDead = slime.damage(yusha.attack());
		if(slimeIsDead ==true) {
			System.out.println("勇者はスライムとの戦闘に勝利した");
			break;
		}
		System.out.println(slime.getName()+"の攻撃");
		boolean heroIsDead = yusha.damage(slime.attack());
		if(heroIsDead ==true) {
			System.out.println("スライムは勇者との戦闘に勝利した");
			break;
		}

		}

		System.out.println(yusha.showParameter());
		System.out.println(slime.showParameter());


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
