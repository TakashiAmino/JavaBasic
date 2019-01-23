package practice10;

public class Car{

	int serialNo;
	String color;
	int gasoline;

	int run() {

	int run =0;
	if (this.gasoline>0) {
	this.gasoline -= 1;
	int limitNumber = 14;
	int random = 0;
	random = new java.util.Random().nextInt(limitNumber);

	run = random + 1;
	}else if(this.gasoline==0) {
		run = -1;
	}
	return run;
}
}



//クラス名
//* 		Car
//* フィールド
//* 		serialNo		:	int型
//* 		color			：	String型
//* 		gasoline		：	int型

//戻り値(int)、メソッド名(run)、引数(なし)
// 			ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
//			ガソリンが負の数になった場合（もう進めない）は-1を返します。