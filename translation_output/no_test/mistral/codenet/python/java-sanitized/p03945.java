import java.util.Scanner;

public class p03945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println((lambda x: x.count('WB') + x.count('BW'))(scanner.nextLine()));
    }
}