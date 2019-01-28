package Practice.Practice18;

public class Practice18 {
	public static void main(String[] args) {
		Employee a = new Employee();
		a.setCompany("おやつカンパニー");
		a.setName("蒲焼さん太郎");
		a.setAge(24);

		System.out.println("会社は"+a.getCompany()+"、名前は"+a.getName()+"、年齢は"+a.getAge());
	}
}