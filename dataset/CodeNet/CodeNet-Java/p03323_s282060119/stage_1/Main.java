import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
var newVariable_0 = sc.hasNextInt();            while (newVariable_0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println((a<9&&b<9)?"Yay!":":(");
            }
        }
    }
}