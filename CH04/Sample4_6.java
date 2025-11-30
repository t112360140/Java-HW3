public class Sample4_6 {
    public static void main(String[] args) {
        Car[] cars;
        cars = new Car[2]; // 準備父類別陣列

        cars[0] = new Car();
        cars[0].setCar(1234, 20.5);

        cars[1] = new RacingCar();
        cars[1].setCar(4567, 30.5);

        for(int i=0; i<cars.length; i++) {
            cars[i].show(); // 根據物件實體呼叫對應的 show
        }
    }
}