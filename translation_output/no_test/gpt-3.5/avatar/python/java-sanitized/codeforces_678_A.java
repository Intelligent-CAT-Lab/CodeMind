import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int vamshi = scanner.nextInt();
        int z = scanner.nextInt();
        
        int result = ((vamshi / z) + 1) * z;
        System.out.println(result);
    }
}