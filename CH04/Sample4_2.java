class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }
}

class RacingCar extends Car {
    private int course;

    public RacingCar(int n, double g, int c) {
        super(n, g); // 呼叫父類別雙參數的建構式
        course = c;
        System.out.println("生產了編號為" + course + "的賽車");
    }
}

public class Sample4_2 {
    public static void main(String[] args) {
        RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
    }
}