import java.util.*;

public class p03129 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if((sc.nextInt() + 1) / 2 >= sc.nextInt()) System.out.println("YES");
        else System.out.println("NO");
    }

}



import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if (a + 1) // 2 >= b:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()