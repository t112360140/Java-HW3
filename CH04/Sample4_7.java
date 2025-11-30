class Car {
    protected int num;
    protected double gas;

    public void setCar(int n, double g) {
        num = n; gas = g;
    }

    // 覆寫 Object 類別的 toString
    public String toString() {
        String str = "車號:" + num + ";汽油量:" + gas;
        return str;
    }
}

public class Sample4_7 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCar(1234, 20.5);
        System.out.println(car1); // 自動呼叫 toString()
    }
}