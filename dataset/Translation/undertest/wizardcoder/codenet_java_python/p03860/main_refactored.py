class main:
    import java.util.Scanner;
    
    public class p03860 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] lines = sc.nextLine().split(" ");
            char upper = lines[1].charAt(0);
            System.out.println("A" + upper +"C");
        }
    }