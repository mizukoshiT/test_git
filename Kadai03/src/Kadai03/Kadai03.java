package Kadai03;

public class Kadai03 {

	public static void main(String[] args) {
	//変数iを1~9まで繰り返す//
	for(int i = 1;i <= 9;i++) {
		//変数jを1~9まで繰り返す//
		for(int j = 1;j <= 9;j++) {
			//変数iとjを繰り返し掛けたものを出力する//
			System.out.printf("%3d",i*j);
			}
		//改行して出力する//
		System.out.println();
		}	
	}
}
