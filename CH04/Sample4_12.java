interface iVehicle {
    int weight = 1000; // 介面欄位自動為常數
    void show();       // 介面方法自動為抽象
}

class Car implements iVehicle {
    private int num;
    private double gas;
    public Car(int n, double g) { num = n; gas = g; }

    @Override
    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class Plane implements iVehicle {
    private int flight;
    public Plane(int f) { flight = f; }

    @Override
    public void show() {
        System.out.println("飛機的班次是" + flight);
    }
}

public class Sample4_12 {
    public static void main(String[] args) {
        iVehicle[] ivc = new iVehicle[2];
        ivc[0] = new Car(1234, 20.5);
        ivc[1] = new Plane(232);

        for(int i=0; i<ivc.length; i++) {
            ivc[i].show();
        }
    }
}