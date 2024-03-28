class main:
    import java.util.Scanner;
    
    public class p03073 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String tail = sc.next();
            int n = tail.length();
            String[] tailsp = tail.split("");
            String zero = "0";
            String one = "1";
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0 and tailsp[i].equals(zero)) {
                    count++;
                }
                if (i % 2 == 1 and tailsp[i].equals(one)) {
                    count++;
                }
            }
            n -= count;
            if (count > n) {
                System.out.print(n);
            } else {
                System.out.print(count);
            }
        }
    }