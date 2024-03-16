import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        
        if (a <= b) {
            System.out.println(new String(new char[b]).replace("\0", Integer.toString(a)));
        } else {
            System.out.println(new String(new char[a]).replace("\0", Integer.toString(b)));
        }
        
        scanner.close();
    }
}