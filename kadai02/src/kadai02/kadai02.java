package kadai02;
/*[演習02]整数型の配列「numbers」を宣言して、
 *{10,4,340,180,79}を代入してください。
 *また、配列の中から最大値をコンソールに表示するプログラムを作成してください。
 */
public class kadai02 {

	public static void main(String[] args) {
		//最大値の変数を用意する//
		int max;
		//numbersに{}の中の値を代入する//
		int numbers[] = {10,4,340,180,79};
		//numbersに代入した値をmaxに代入する//
		max = numbers[0];
		//配列の要素を全て取得し代入する//
		for(int i = 0; i < numbers.length; i++) {
			//maxよりnumbersが小さいなら、maxにnumbersを代入する//
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		//取得した最大値の変数をコンソールに出力する//
		System.out.println("最大値は"+ max + "です。");
	}
}
