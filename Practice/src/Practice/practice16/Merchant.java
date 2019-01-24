package Practice.practice16;

public class Merchant{
	int price = 100;
	int stock = 100;
	int money = 0;

void sellItem(int order) {

	if(this.stock>=order) {
	this.stock -= order;
	this.money += (order*this.price);
	}
}

String confirmMoney() {
	return ("売り上げは"+money+"円です");
	}
}
