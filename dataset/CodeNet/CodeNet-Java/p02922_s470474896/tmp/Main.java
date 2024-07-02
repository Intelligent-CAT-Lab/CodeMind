import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
System.out.println("[INST]5;X;sc.nextInt();"+X);
        int Y = sc.nextInt();
System.out.println("[INST]6;Y;sc.nextInt();"+Y);

        int i = 0;
        while(((X-1)*i +1 )<Y){
            i++;
        }
        System.out.println(i);
    }
}