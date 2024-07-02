import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = nextInt(scanner);
        int m1 = nextInt(scanner);
        int h2 = nextInt(scanner);
        int m2 = nextInt(scanner);
        int k = nextInt(scanner);
        int h = h2 - h1;
        int m = m2 - m1;
        int day = (h * 60) + m;
        System.out.println(day - k);

    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
System.out.println("[INST]18;None;Integer.parseInt(scanner.next());"+Integer.parseInt(scanner.next()));
System.out.println("[INST]18;None;scanner.next();"+scanner.next());
    }
}
