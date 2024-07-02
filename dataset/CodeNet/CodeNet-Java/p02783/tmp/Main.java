import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");
System.out.println("[INST]4;line;sc.nextLine().split(' ');"+line);
System.out.println("[INST]4;None;sc.nextLine();"+sc.nextLine());

            int h = Integer.valueOf(line[0]);
System.out.println("[INST]6;h;Integer.valueOf(line[0]);"+h);
            int a = Integer.valueOf(line[1]);
System.out.println("[INST]7;a;Integer.valueOf(line[1]);"+a);

            int n = h/a;
            if (h%a > 0) {
                n += 1;
            }

            // 出力
            System.out.println(n);
        }
    }
}