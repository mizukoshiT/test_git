package Kadai06;
/*[演習06]演習05のプログラムを以下のように変更してください。 1~12以外が入力された場合には、
 * 入力が間違っています、再度入力してください。と表示し、再入力を受け付けてください。*/
import java.util.Scanner;

public class Kadai06 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成し引数で標準入力System.inを指定する
		Scanner scanner = new Scanner(System.in);
		// ()の文字を出力する
		System.out.print("月を1~12で入力してください。（Enterキーで終了）");
		// 入力された内容をインスタンスから取得する
		int input_text = scanner.nextInt();
		//12より大きい数の場合は()の中をループさせる
		while(input_text > 12) {
			// 例外が発生しそうな処理
			try {
				// ()の文字を出力する
				System.out.println("入力が間違ってます。再度入力してください。");
				// 入力された内容をインスタンスから取得する//
				input_text = scanner.nextInt();
			//例外発生時の処理
	        }catch(Exception e) {
	        	// ()の文字を出力する
	            System.out.println("数字で入力してください。");
	         //()の文字を出力する
	            System.out.println(e);
	          //入力バッファのクリア
	            scanner.next();
	        }
		}
		//条件と複数の値を比較し、一致する値に対応した処理を行う。
		switch(input_text) {
		//値が1.3.5.7.8.10.12のとき（）の内容を出力する。
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(input_text + "月は31日です。");
			break;
		//値が2のとき（）の内容を出力する。
		case 2:
			System.out.println(input_text + "月は28日です。");
			break;
		//値が4.6.9.11のとき（）の内容を出力する。
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(input_text + "月は30日です。");
			break;
		}
			// Scannerクラスのインスタンスを閉じる
			scanner.close();
	}
}

