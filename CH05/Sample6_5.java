class Sample6_5 {
    public static void main(String[] args) {
        Car car1 = new Car("1號車");
        car1.start();

        try {
            car1.join(); // 等待 car1 執行完畢
        } catch (InterruptedException e) {
            
        }

        System.out.println("結束main()的處理工作。");
    }
}