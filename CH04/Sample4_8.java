// 註：此範例講義顯示的是 Object 預設的 equals (比較記憶體位址)
public class Sample4_8 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = car1; // car3 指向 car1

        System.out.println("car1與car2相同 " + car1.equals(car2));
        System.out.println("car1與car3相同 " + car1.equals(car3));
    }
}