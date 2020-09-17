package Kadai_01;

public class Person {
	//フィールド変数を定義
	private String name;
	private int age;
	
	//フィールドの値を取得する
	public String getName() {
		return name;
	}
	//フィールドの値を取得する
	public int getAge() {
		return age;
	}
	//フィールドに値を代入する
	public void setName(String nm) {
		this.name = nm;
	}
	//フィールドに値を代入する
	public void setAge(int ag) {
		this.age =ag;
	}
	//showProfileメソッドを定義
	public void showProfile() {
		System.out.println("名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
	}
}
