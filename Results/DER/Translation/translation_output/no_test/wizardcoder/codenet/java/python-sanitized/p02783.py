import java.util.Scanner;

public class p02783 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");

            int h = Integer.parseInt(line[0]);
            int a = Integer.parseInt(line[1]);

            int n = h//a;
            if (h%a > 0) {
                n += 1;
            }

            // åºå
            System.out.println(n);
        }
    }
}