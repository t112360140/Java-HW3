package pb;

class Sample5_3 {
    public static void main(String[] args) {
        // 跨套件使用類別需要完整名稱 (Full Qualified Name)
        pc.Car car1 = new pc.Car(); 
        car1.show();
    }
}