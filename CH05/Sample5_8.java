class Sample5_8 {
    public static void main(String[] args) {
        try {
            int[] test;
            test = new int[5];
            test[10] = 80;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("超過陣列的範圍了");
            System.out.println("發生了" + e + "這個例外");
        }
    }
}