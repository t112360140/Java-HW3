package pc;

public class Car { // 類別必須是 public 才能被外包使用
    private int num;
    private double gas;
    
    public Car() {
        num = 0; gas = 0.0;
        System.out.println("已生產了汽車");
    }
    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}