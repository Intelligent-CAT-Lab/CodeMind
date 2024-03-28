import java.util.*;

public class p02952 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c = 0;
        a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (String.valueOf(i).length() % 2 != 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}



import java.util.Scanner

def main():
    sc = Scanner(System.in)
    a = sc.nextInt()
    c = 0
    for i in range(1, a + 1):
        if len(str(i)) % 2 != 0:
            c += 1
    print(c)

if __name__ == "__main__":
    main()