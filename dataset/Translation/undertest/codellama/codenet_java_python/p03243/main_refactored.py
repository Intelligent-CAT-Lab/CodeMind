class main:
    import java.util.Scanner;
    
    public class p03243 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = n; i < 1000; i++) {
                if (i % 111 == 0) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
    
    
    
    import java.util.Scanner;
    
    public class p03243 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = n; i < 1000; i++) {
                if (i % 111 == 0) {
                    print(i);
                    return;
                }
            }
        }
    }