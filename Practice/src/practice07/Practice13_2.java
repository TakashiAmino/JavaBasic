package practice07;

public class Practice13_2 {
	public static void main(String[] args) {

		int [][] score= {
				{95,88,87},
				{70,81,100},
				{12,98,90}
		};

		for(int[] value:score) {
			int sum =0;
			for(int i:value) {
				sum+=i;
			}
			System.out.println(sum);
			}


			}
}