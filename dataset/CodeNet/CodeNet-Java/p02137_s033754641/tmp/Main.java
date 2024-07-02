import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
System.out.println("[INST]5;None;sc.hasNextInt();"+sc.hasNextInt());
            int N = sc.nextInt();
System.out.println("[INST]6;N;sc.nextInt();"+N);
            System.out.println(N - (N % 500));
        }
    }
}


