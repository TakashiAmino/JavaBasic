package Practice.practice17;

public class Practice17 {
	public static void main(String[] args) {

		Employee[] Employees = new Employee[3];
		Employees[0] = new Employee();
		Employees[1] = new Employee("太郎");
		Employees[2] = new Employee("二郎",30);

		for (int i =0; i<Employees.length;i++) {
		System.out.println("会社は"+Employee.company+"、名前は"+Employees[i].name+"、年齢は"+Employees[i].age);
		}
	}
}