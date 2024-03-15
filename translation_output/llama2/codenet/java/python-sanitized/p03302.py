import java.util

class p03302:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        if a + b == 15:
            print("+")
        elif a * b == 15:
            print("*")
        else:
            print("x")