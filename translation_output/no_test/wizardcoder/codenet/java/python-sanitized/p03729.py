import java.util.Scanner;

class p03729:

    def main(self):
        sc = Scanner(System.in)

        a = sc.next()
        b = sc.next()
        c = sc.next()

        if a[a.length() - 1] == b[0] and b[b.length() - 1] == c[0]:
            print("YES")
        else:
            print("NO")