package Practice;

public class Practice13 {
	public static void main(String[] args) {

		int [][] score= {
				{95,88,87},
				{70,81,100},
				{12,98,90}
		};
		int total_a=0;
		int total_b=0;
		int total_c=0;

		for(int value:score[0]) {
			total_a+=value;
		}
		for(int value:score[1]) {
			total_b+=value;
		}
		for(int value:score[2]) {
			total_c+=value;
		}

		System.out.println(total_a);
		System.out.println(total_b);
		System.out.println(total_c);


	}
}

