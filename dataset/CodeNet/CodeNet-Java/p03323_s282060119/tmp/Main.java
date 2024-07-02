import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
System.out.println("[INST]5;None;sc.hasNextInt();"+sc.hasNextInt());
                int a = sc.nextInt();
System.out.println("[INST]6;a;sc.nextInt();"+a);
                int b = sc.nextInt();
System.out.println("[INST]7;b;sc.nextInt();"+b);
                System.out.println((a<9&&b<9)?"Yay!":":(");
            }
        }
    }
}