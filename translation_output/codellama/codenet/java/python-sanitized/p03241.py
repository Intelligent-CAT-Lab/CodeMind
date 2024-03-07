import java.util.*;

public class p03241 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        for (int i = m / n; true; i--) {
            if (m % i == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}



import java.util.Scanner

def main():
    scanner = Scanner(System.in)
    n = scanner.nextInt()
    m = scanner.nextInt()
    for i in range(m // n, 0, -1):
        if m % i == 0:
            print(i)
            break

if __name__ == "__main__":
    main()