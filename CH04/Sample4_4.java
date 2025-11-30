class Car {
    protected int num;
    protected double gas;
    
    // ... 建構式與 setCar 省略，同上 ...
    public void setCar(int n, double g) { num = n; gas = g; }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class RacingCar extends Car {
    private int course;
    
    public void setCourse(int c) { course = c; }

    // 覆寫父類別的 show 方法
    public void show() {
        System.out.println("賽車的車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("賽車編號是" + course);
    }
}

public class Sample4_4 {
    public static void main(String[] args) {
        RacingCar rccar1 = new RacingCar();
        rccar1.setCar(1234, 20.5);
        rccar1.setCourse(5);
        rccar1.show(); // 呼叫子類別覆寫後的方法
    }
}