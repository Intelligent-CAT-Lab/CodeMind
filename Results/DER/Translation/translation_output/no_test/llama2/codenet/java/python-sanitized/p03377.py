import java.util.Scanner;

class p03377:

    def main(self, args):
        s = Scanner(System.in)
        a = s.nextInt()
        b = s.nextInt()
        x = s.nextInt()
        if a + b >= x and a <= x:
            print("YES")
        else:
            print("NO")