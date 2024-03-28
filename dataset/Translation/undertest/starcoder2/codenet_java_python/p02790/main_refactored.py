class main:
    a, b = map(int, input().split())
    
    if a >= b:
        for i in range(a):
            print(b, end='')
    else:
        for i in range(b):
            print(a, end='')
    
    
    
    
    a, b = map(int, input().split())
    
    if a > b:
        print(a)
    else:
        print(b)
    
    /p02790.md
    # p02790
    
    Translate the following java code to python and enclose your solution inside .
    A sample test case is provided below:
    
    Test input:
    4 3
    
    Expected output:
    4
    
    
    
    import java.util.Scanner;
    
    public class p02790 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int a = sc.nextInt();
            int b = sc.nextInt();
    
            if (a > b)
                System.out.println(a);
            else
                System.out.println(b);
    
        }
    }