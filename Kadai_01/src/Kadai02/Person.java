package Kadai02;

public class Person {
		//フィールド変数を定義
		private String name;
		private int age;
		
		//フィールド変数nameに引数に設定した値を代入するメソッド
		public void setName(String nm) {
			this.name = nm;
		}
		//フィールド変数ageに引数に設定した値を代入するメソッド
		public void setAge(int ag) {
			this.age =ag;
		}
		//コンソールに設定した名前と年齢を表示するメソッド
		public void showProfile() {
			System.out.println("名前は" + name + "です。");
			System.out.println("年齢は" + age + "歳です。");
		}
	}
