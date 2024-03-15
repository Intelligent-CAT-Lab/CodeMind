import java.util.Arrays;
import java.util.Scanner;

class p03149:
    def __init__(self):
        pass

    def main(self):
        sc = Scanner(System.in)
        N = [int(sc.next()) for _ in range(4)]
        ans = False
        N.sort()
        if N[0] == 1 and N[1] == 4 and N[2] == 7 and N[3] == 9:
            ans = True
        if ans:
            print("YES")
        else:
            print("NO")