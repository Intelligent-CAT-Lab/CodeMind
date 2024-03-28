import java.util.Scanner

class p04043:
    def main(self):
        sc = Scanner(System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        c = sc.nextInt()

        if a == 5 and b == 7 and c == 5:
            print("YES")
        elif a == 5 and b == 5 and c == 7:
            print("YES")
        elif a == 7 and b == 5 and c == 5:
            print("YES")
        else:
            print("NO")