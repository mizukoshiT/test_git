package Kadai07;

import java.util.Scanner;

/*[演習07]演習04のプログラムをつかって、２つの文字列の入力を受けつけ、
 *  受け付けた文字列同士が等しいか判定してください。*/
public class Kadai07 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成し引数で標準入力System.inを指定する
				Scanner scanner = new Scanner(System.in);
				// ()の文字を出力する
				System.out.print("1つ目の文字列を入力してください。");
				// 入力された内容をインスタンスから取得する
				String input_text = scanner.nextLine();
				// ()の文字を出力する
				System.out.print("2つ目の文字列を入力してください。");
				// 入力された内容をインスタンスから取得する
				String input_text_2 = scanner.nextLine();
				//input_textとinput_text_2が等しい場合{}の中を実行する
				if(input_text.equals(input_text_2)) {
					// 入力された内容を出力する
					System.out.println("入力された文字列は等しいです。");
				//input_textとinput_text_2が違う場合{}の中を実行する
				}else {
					// 入力された内容を出力する
					System.out.println("入力された文字列は異なっています。");
				}
			// Scannerクラスのインスタンスを閉じる
			scanner.close();
	}

}
