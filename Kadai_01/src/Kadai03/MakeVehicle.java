package Kadai03;

public class MakeVehicle {
    public static void main(String[] args) {
        //Vehicleをインスタンス化
        Car car = new Car("GT-R ピュアエディション", "NISSAN", "2020年2月22日",
                100);
        //showVehicleメソッドを呼び出して乗り物の情報を出力
        car.showVehicle();
        System.out.println();
        System.out.println("現在の位置を30移動");
        //move()メソッドを呼び出してcarを走らせる
        car.move(30);
        //display()メソッドを呼び出して位置、燃料、走行距離を表示させる
        car.display();
        System.out.println();
        System.out.println("現在の位置を-50移動");
        car.move(-50);
        car.display();
        System.out.println();
        System.out.println("現在の位置を80移動");
        car.move(80);
        car.display();
    }
}
