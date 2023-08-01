import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    static String fname = "src/a1.txt";
    public static void main(String[] args) {
        try{
            sc = new Scanner(new File(fname));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
            return;
        }
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();

        System.out.println("Сумма: " + (s1 + s2));
    }
}