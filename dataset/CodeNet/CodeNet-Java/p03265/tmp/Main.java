import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
System.out.println("[INST]6;x1;sc.nextInt();"+x1);
        int y1 = sc.nextInt();
System.out.println("[INST]7;y1;sc.nextInt();"+y1);
        int x2 = sc.nextInt();
System.out.println("[INST]8;x2;sc.nextInt();"+x2);
        int y2 = sc.nextInt();
System.out.println("[INST]9;y2;sc.nextInt();"+y2);

        int a = x2 - x1;
        int b = y2 - y1;
        int x3 = x2 - b;
        int y3 = y2 + a;
        int x4 = x3 - a;
        int y4 = y3 - b;

        System.out.println(String.format("%d %d %d %d", x3, y3, x4, y4));
        sc.close();
    }

}
