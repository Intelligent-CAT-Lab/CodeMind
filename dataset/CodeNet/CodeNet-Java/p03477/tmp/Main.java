import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt() + sc.nextInt();
System.out.println("[INST]5;None;sc.nextInt();"+sc.nextInt());
System.out.println("[INST]5;None;sc.nextInt();"+sc.nextInt());
        int right = sc.nextInt() + sc.nextInt();
System.out.println("[INST]6;None;sc.nextInt();"+sc.nextInt());
System.out.println("[INST]6;None;sc.nextInt();"+sc.nextInt());
        if(left > right) {
            System.out.print("Left");
        } else if (left == right) {
            System.out.print("Balanced");
        } else {
            System.out.print("Right");
        }
    }
}
