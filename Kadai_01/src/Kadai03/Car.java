package Kadai03;

public class Car extends Vehicle {
    //追加のフィールド変数を設定
    private int totalMileage;
    //コンストラクタの設定
    Car(String vehicleName, String manufacturer, String purchaseDay,
            int remainingFuel) {
        //コンストラクタを引き継ぐ
        super(vehicleName, manufacturer, purchaseDay, remainingFuel);
        //追加の走行距離を0にしておく
        this.totalMileage = 0;
    }
    public int getTotalMileage() {
        return totalMileage;
    }
    @Override
    public void move(int coodinate) {
        // 移動距離に対して燃料が十分にある時
        if (super.getRemainingFuel() >= Math.abs(coodinate)) {
            
            // スーパークラスのmove()で移動させ燃料を消費する
            super.move(coodinate);
            // 総移動距離を足す
            totalMileage += Math.abs(coodinate);
            
        // 燃料はあるが移動距離には届かない時（残りの燃料分走らせる）
        } else {
            
            // 燃料がなくなるメッセージ、残りの燃料でどれだけ走れるか
            System.out.println("燃料がなくなります。" + super.getRemainingFuel()
                    + "Km移動しました。これ以上移動できません。");
            // 総走行距離は残りの燃料
            totalMileage += Math.abs(super.getRemainingFuel());
            // 残りの燃料分だけ走らせる
            super.move(Math.abs(super.getRemainingFuel()));
        }
    }
    // 現在のX座標、残り燃料、総走行距離をコンソールに出力
    public void display() {
        System.out.println("現在のX座標は、" + super.getCoodinateX());
        System.out.println("残りの燃料は、" + super.getRemainingFuel() + "ℓ");
        System.out.println("総走行距離は、" + totalMileage);
    }
}
