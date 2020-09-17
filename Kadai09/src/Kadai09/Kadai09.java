package Kadai09;
/*1000以下の素数を配列に格納して、配列の内容を画面に表示するプログラムを作成してください。*/
public class Kadai09 {

	public static void main(String[] args) {
		//変数primeTableを用意する
		int primeTable[] = new int [1000];
		//変数primeSizeを用意する
		int primeSize = 1;
		// primeTableの0番目の要素を2に初期化する
		primeTable[0] = 2;
		//変数nを3に初期化して、forループでnの値を2ずつ増やし、奇数列を生成する
		for (int n = 3; n < primeTable.length; n += 2) {
			//変数flagをtrueに初期化する	
			boolean flag = true;
			//配列の要素を全て取得し代入する
			for (int i = 1; i < primeSize; i++) {
				//primeTableをpに代入する
				int p = primeTable[i];
				//p*pがnより大きかったらtrueを返す
				if (p * p > n) {
					break;
					//n%pが0の場合 
				} else if (n % p == 0) {
					//flagにfalseを代入する
					flag = false;
					break;
				}
			}
			//flagがtrueであればnをprimeTtableに追加して、primeSizeの値を+1する。
			if (flag) primeTable[primeSize++] = n;
		}
		for (int i = 0; i < primeSize; i++) {
			System.out.print(primeTable[i] + " ");
		}
	}
}
