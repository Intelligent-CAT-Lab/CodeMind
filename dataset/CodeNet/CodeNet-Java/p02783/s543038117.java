import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");

            int h = Integer.valueOf(line[0]);
            int a = Integer.valueOf(line[1]);

            int n = h/a;
            if (h%a > 0) {
                n += 1;
            }

            // 出力
            System.out.println(n);
        }
    }
}