package Kadai04;
	/*[演習04]キーボードから読み込んだ文字列を出力するプログラムを作成してください。
	※入力にはいくつかやり方がありますが、Scannerを利用してください。
	*/
import java.util.Scanner;

public class Kadai04 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成し引数で標準入力System.inを指定する//
		Scanner scanner = new Scanner(System.in);
		// ()の文字を出力する//
		System.out.print("文字列を入力してください。（Enterキーで終了）");
		// 入力された内容をインスタンスから取得する//
		String input_text = scanner.nextLine();
		// 入力された内容を出力する//
		System.out.println(input_text + "と入力されました。");
		// Scannerクラスのインスタンスを閉じる//
		scanner.close();
	}
}