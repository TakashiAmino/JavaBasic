package Practice.practice17;

 class Employee{
	static String company = "テストカンパニー";
	String name;
	int age;
Employee(){
	this.name = "名無し";
	this.age  = 20;
	}
Employee(String name){
	this.name = name;
	this.age  =  20;
}
Employee(String name,int age){
	this.age = age;
	this.name = name;
}
}
