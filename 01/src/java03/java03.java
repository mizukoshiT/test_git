package java03;
/*System.out.print("点数は小さい順に");
		for(int n : num) {
			System.out.print(n + " ");} Kadai08*/
public class java03 {

	public static void main(String[] args) {
		int isHungry = 1;
		String food = "コロッケ";
		System.out.println("こんにちわ");
		
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです。");
		}else {
			System.out.println("はらぺこです。");
		}
		if(isHungry == 1) {
			System.out.println(food + "をいただきます。");
		}
		System.out.println("ごちそうさまでした。");
	}
}
