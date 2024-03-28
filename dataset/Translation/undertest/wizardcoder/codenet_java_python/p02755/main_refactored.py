class main:
    import java.util.Scanner;
    
    public class p02755 {
        public static void main(String[] args) {
            new p02755().run();
        }
    
        private void run() {
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
    
            if(A > B) {
                System.out.println(-1);
                return;
            }
    
            for(int i = 1; i < 99999999; i ++) {
                if((int)(i * 0.08) == A &&  (int)(i * 0.10) == B) {
                    System.out.println(i);
                    return;
                }
            }
            System.out.println(-1);
        }
    }