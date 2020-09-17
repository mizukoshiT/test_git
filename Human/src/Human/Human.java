package Human;

public class Human {
	//フィールド変数を定義 private = カプセル化(変えたくない値の定義)
	private String name;
	private int height;
	private int weight;
	private int age;
	
	//getter,setterを作りたい場合は作りたい範囲を選択して右クリックからソース
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//コントラクタを定義　getter,setterを使うと省略できる
	//Human(String name, int height, int weight, int age){
		//このクラスのフィールド変数
		//this.name = name;
		//this.height = height;
		//this.weight = weight;
		//this.age = age;
	//}
	
	//メソッド
	public void introduce() {
		System.out.println("私の名前は" + name);
		System.out.println("身長は" + height);
		System.out.println("体重は" + weight);
		System.out.println("年齢は" + age);
	}
}
