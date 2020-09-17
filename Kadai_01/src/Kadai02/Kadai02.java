package Kadai02;

public class Kadai02 {

	public static void main(String[] args) {
		//Shainクラスのインスタンス化
		Shain shain1 = new Shain();
		Shain shain2 = new Shain();
		
		//継承した変数nameに()の中の文字列を代入
		shain1.setName("山田");
		//継承した変数ageに()の中の数値を代入
		shain1.setAge(28);
		//変数CpmpanyNameに()の中の文字列を代入
		shain1.setCopmpanyName("Apple");
		//showProfileメソッドを呼び出す
		shain1.showProfile();
		
		
		//継承した変数nameに()の中の文字列を代入
		shain2.setName("佐藤");
		//継承した変数ageに()の中の数値を代入
		shain2.setAge(22);
		//変数CpmpanyNameに()の中の文字列を代入
		shain2.setCopmpanyName("Windows");
		//showProfileメソッドを呼び出す
		shain2.showProfile();
	}
}
