package Kadai08;
/*[演習08] キーボードから5人分の点数の入力を受け付け、
 * 5人の合計点数、平均点数、最高点数を表 示してください。
 * さらに、小さい順に並べて表示してください。*/
import java.util.Scanner;
import java.util.Arrays;

public class Kadai08 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成し引数で標準入力System.inを指定する
		Scanner scanner = new Scanner(System.in);
		//変数numを用意する
		int[] num = new int[5];
		//変数sumを用意する
		int sum = 0;
		//変数maxを用意する
		int max = 0;
		//変数avgを用意する
		double avg;
		//配列の要素を全て取得し代入する
		for (int score = 0; score < num.length; score++) {
			//()の中に内容を出力する
			System.out.print(score + 1 + "人目の点数を入力してください。");
			// 入力された内容をインスタンスから取得する
			num[score] = scanner.nextInt();
			//numの値をsumに足して代入する
			sum += num[score];
			//numの値maxより大きい場合numをmaxに代入する
			if(num[score] >= max) {
				max = num[score];
			}
		}
		//()の中に内容を出力する
		System.out.print("合計点数は" + sum + "点です。");
		//入力した数値の平均を出す
		avg = (double)sum / num.length;
		//()の中に内容を出力する
		System.out.print("平均点数は" + avg + "点です。");
		//()の中に内容を出力する
		System.out.println("最高点数は" + max + "点です。");
		//numの値を小さい順にする
		Arrays.sort(num);
		//()の中に内容を出力する
		System.out.print("点数は小さい順に");
		//全ての要素に含まれる値を順に取り出して処理する
		for(int sort : num) {
			//()の中に内容を出力する
			System.out.print(sort + " ");
		}
	}
}