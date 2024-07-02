import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
System.out.println("[INST]6;num;sc.nextInt();"+num);

        int answer = 180 * (num - 2);

        System.out.println(answer);
    }
}
