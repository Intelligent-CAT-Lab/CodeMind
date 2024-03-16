import java.util.Scanner;

public class p00404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        System.out.println(search(x, y));
    }

    private static int search(int x, int y) {
        int x_min = 0;
        int y_min = 0;
        int x_max = 0;
        int y_max = 0;
        int f = 0;
        int f1 = 1;
        int f2 = 0;
        int p = 0;
        
        while(true) {
            if (x_min <= x && x <= x_max && y_min <= y && y <= y_max)
                return p % 3 + 1;
            
            f = f1 + f2;
            
            switch (p % 4) {
                case 0: x_max += f; break; // east
                case 1: y_max += f; break; // north
                case 2: x_min -= f; break; // west
                case 3: y_min -= f; break; // south
            }
            
            f2 = f1;
            f1 = f;
            p++;
        }
    }
}