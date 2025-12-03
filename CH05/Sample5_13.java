import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Sample5_13 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("請指定正確的檔案名稱");
            System.exit(1);
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("輸出入錯誤");
        }
    }
}