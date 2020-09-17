package java07;

public class java07 {

	public static void main(String[] args) {
		System.out.println("数あてゲーム");
		int[] numbers = {3, 4, 9};
		System.out.println("１桁の数字を入力してください。");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int i : numbers) {
			if(i == input) {
				System.out.println("アタリ");
				break;
			}else {
				System.out.println("ハズレ");
				break;
			}
		}
	}
}