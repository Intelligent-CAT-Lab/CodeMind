class main:
    import java.util.Scanner;
    
    public class p03427 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Long N = scanner.nextLong() + 1;
            scanner.close();
    
            // æ¡æ°
            String s = String.valueOf(N);
            int length = s.length();
            int c = Integer.parseInt(s.substring(0, 1));
            int max = (c - 1) + 9 * (length - 1);
    
            System.out.println(max);
        }
    }