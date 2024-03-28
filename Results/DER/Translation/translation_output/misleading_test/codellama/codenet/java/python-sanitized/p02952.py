import java.util.Scanner;

public class p02952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= a; i++) {
            if (String.valueOf(i).length() % 2 != 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}



a = int(input("Enter a number: "))
c = 0
for i in range(1, a+1):
    if len(str(i)) % 2 != 0:
        c += 1
print(c)