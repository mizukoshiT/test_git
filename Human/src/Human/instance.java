package Human;

public class instance {

	public static void main(String[] args) {
			//コンストラクタを使ったインスタンス化 getter,setterを使う場合()の中は書かなくていい
			//Human instanceHuman = new Human();
			
			//instanceHuman.setName("大樹");
			//System.out.println(instanceHuman.getName());
			//instanceHuman.setHeight(170);
			//instanceHuman.setWeight(55);
			//instanceHuman.setAge(26);
			//introduceメソッドを呼び出している
			//instanceHuman.introduce();
				Student student = new Student();
				
				student.setName("taiki");
				student.setBirthday("1994/08/18");
				student.setSchoolName("seisen");
				
				student.introduce();
				}
		}
