import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class p03292:
    def __init__(self):
        pass

    def main(self):
        sc = Scanner(System.in)
        T = sc.nextInt()
        R = sc.nextInt()
        Y = sc.nextInt()

        A = max(max(T,R),Y)
        B = min(min(T,R),Y)

        print(A-B)


if __name__ == '__main__':
    p03292().main()