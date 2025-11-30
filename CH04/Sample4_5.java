public class Sample4_5 {
    public static void main(String[] args) {
        Car car1;
        car1 = new RacingCar(); // 父類別變數操作子類別物件
        
        car1.setCar(1234, 20.5);
        car1.show(); // 多型：會呼叫 RacingCar 的 show()
        
        // car1.setCourse(5); // 錯誤：無法呼叫子類別獨有的方法
    }
}