package Kadai_01;

public class Kadai_01 {

	public static void main(String[] args) {
		//Personクラスをインスタンス化
		Person instancePerson = new Person();
		
		//変数nameに()の中の文字列を代入
		instancePerson.setName("Taro Yamada");
		//変数ageに()の中の数値を代入
		instancePerson.setAge(47);
		//showProfileメソッドを呼び出す
		instancePerson.showProfile();
		
	}

}
