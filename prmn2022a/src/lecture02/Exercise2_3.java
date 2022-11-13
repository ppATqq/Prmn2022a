package lecture02;

public class Exercise2_3 {
//クラス内で使える変数はフィールド変数
    public static void main(String[] args) {

        Tire[] tires = new Tire[4];//関数内のローカル変数
        //↑は枠を空けただけ（中身は無し）

        for(int i = 0;i < 4;i++){
            tires[i] = new Tire(65);
        }//空いてる枠にインスタンス化したもののアドレスを入れる。


        Engine engine = new Engine(400);

        Car car = new Car(tires,engine);

        GasStation gasStation = new GasStation();
        gasStation.refuel(car);

        car.startEngine();
        car.run();

    }
}
