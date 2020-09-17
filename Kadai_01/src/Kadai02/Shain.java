package Kadai02;

public class Shain extends Person {
	//フィールド変数を定義
	private String copmpanyName;
	//フィールド変数copmpanyNameに引数に設定した値を代入するメソッド
	public void setCopmpanyName(String copmpanyName) {
		this.copmpanyName = copmpanyName;
	}
	//superクラスのshowProfile()メソッドを呼び出す.
	//会社名を追加し出力するメソッド
	@Override
	public void showProfile() {
		super.showProfile();
		System.out.println("会社名は" + copmpanyName + "です。");
	}
}
