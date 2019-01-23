package practice09;

public class PTra09_02 {
	public static void main(String[] args) {
		String[] array = {"Plain", "Island", "Mountain", "Swamp", "Forest"};

		String[] result = practice09.util.Util.shuffleArray(array);
		for(String value:result) {
			System.out.println(value);
		}
		

		// ★ 配列arrayを、Util内のメソッドを用いてランダムに並び替えてください
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです


		// ★ ランダムに並び替えた後の配列を前から順に全て表示してください

	}
}
