package kadai01;
/*[演習01] 
 * 1から30まで順番に数をコンソールに表示してください。
 * ただし、その数が3で割り切れるなら"Fizz"、5で割り切れるなら"Buzz"、
 * 両方で割り切れるなら"Fizzbuzz"と表示してください。
 */
public class kadai01 {

	public static void main(String[] args) {
		//30になるまで反復処理する//
		for(int number = 1;number <=30; number++) {
			//3と5で割り切れる数をFizzBuzzと出力する。//
			if(number % 3 == 0 && number % 5 == 0) {
				System.out.println("FizzBuzz");
			//3で割り切れる数をFizzと出力する。//
			}else if(number % 3 == 0) {
				System.out.println("Fizz");
			//5で割り切れる数をBuzzと出力する。//
			}else if(number % 5 == 0) {
				System.out.println("Buzz");
			//それ以外を数字で出力する。//
			}else {
			System.out.println(number);
			}
		}
	}
}