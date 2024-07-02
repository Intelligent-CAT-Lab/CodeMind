import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
System.out.println("[INST]5;None;sc.hasNextInt();"+sc.hasNextInt());
            int A = sc.nextInt();
System.out.println("[INST]6;A;sc.nextInt();"+A);
            int B = sc.nextInt();
System.out.println("[INST]7;B;sc.nextInt();"+B);

            System.out.printf("%.10f\n", B * B * B * Math.PI / 3.0 * 4.0);
System.out.println("[INST]9;None;System.out.printf('%.10f\n', B * B * B * Math.PI / 3.0 * 4.0);"+System.out.printf("%.10f\n", B * B * B * Math.PI / 3.0 * 4.0));
        }
    }
}

