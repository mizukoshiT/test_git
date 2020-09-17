package Kadai03;

public class Vehicle {
    //フィールド変数を定義
    private String vehicleName;
    private String manufacturer;
    private String purchaseDay;
    private int coodinateX;
    private int remainingFuel;
    Vehicle(String vehicleName, String manufacturer, String purchaseDay,
             int remainingFuel) {
        // Vehicleのフィールド変数に渡した引数を代入
        this.vehicleName = vehicleName;
        this.manufacturer = manufacturer;
        this.purchaseDay = purchaseDay;
        this.coodinateX =  0;
        this.remainingFuel = remainingFuel;
    }
    // 購入日を取得するgetPuechaseDayメソッド
    public String getPurchaseDay() {
        return purchaseDay;
    }
    // X座標を取得するgetCoodinateXメソッド
    public int getCoodinateX() {
        return coodinateX;
    }
    // 残り燃料を取得するgetRemainingFuelメソッド
    public int getRemainingFuel() {
        return remainingFuel;
    }
    /**
     *  X座標を移動させるmoveメソッド
     *  動いた引数分だけX座標を移動させて燃料を消費させる
     */
    public void move(int coodinate) {
        
        this.coodinateX += coodinate;
        this.remainingFuel -= Math.abs(coodinate);
    }
    
    /** 
     * Vehicleの情報を見るためのメソッド、下記情報をコンソールに出力
     * 車の名前、メーカー、購入日、X座標、残りの燃料
     */
    public void showVehicle() {
        System.out.println("車の名前は" + vehicleName + "です。");
        System.out.println("メーカーは" + manufacturer + "です。");
        System.out.println("購入日は" + purchaseDay + "です。");
        System.out.println("現在の位置のX座標は" + coodinateX + "です。");
        System.out.println("残りの燃料は" + remainingFuel + "ℓです。");
    }
}
