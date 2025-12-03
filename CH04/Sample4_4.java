class Car {
    protected int num;
    protected double gas;
    
    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
    
    public void setCar(int n, double g) {
        num = n; gas = g;
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class RacingCar extends Car {
    private int course;
    
    public void setCourse(int c) { course = c; }

    @Override
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