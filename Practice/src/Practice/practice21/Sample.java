package Practice.practice21;

public class Sample{
	public static void main(String[] args) {

		int[] nums = {
				10,
				-2,
				4,
				175,
				-6

		};
		for(int num : nums) {
		try {
			System.out.println(numCheck(num));
		}catch(RuntimeException r){
			System.out.println("RuntimeExceptionが発生しました");
			continue;
		}
		}

	}
	public static int numCheck(int num) {
		if (num>=0) {
			return num;
		}else {
			throw new RuntimeException();
		}
	}
}