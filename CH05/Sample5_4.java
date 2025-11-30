package pb;
import pc.Car; // 匯入 pc 套件的 Car

class Sample5_4 {
    public static void main(String[] args) {
        Car car1 = new Car(); // 匯入後不用加套件前綴
        car1.show();
    }
}