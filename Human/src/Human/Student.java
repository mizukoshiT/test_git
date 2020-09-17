package Human;

//継承 親のフィールド変数を引き継ぐ
public class Student extends Human {
	
	//足りない変数を用意する
		private String birthday;
		private String schoolName;
		
		//getter.setterを作る
		public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
		public String getSchoolName() {
			return schoolName;
		}
		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}
		
		//オーバーライド
		@Override
		public void introduce() {
			//親のintroduce()メソッドを呼び出している
			super.introduce();
			
			System.out.println("誕生日は" + birthday + "です。");
			System.out.println("学校名は" + schoolName + "です。");
		}
}

