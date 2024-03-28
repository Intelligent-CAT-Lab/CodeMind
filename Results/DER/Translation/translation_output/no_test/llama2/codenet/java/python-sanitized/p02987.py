import java.util.Arrays;
import java.util.Scanner;

class p02987:
    def __init__(self):
        pass

    def main(self):
        sc = Scanner(System.in)
        s = sc.next().toCharArray()
        Arrays.sort(s)
        if s[0] == s[1] and s[2] == s[3] and s[1] != s[2]:
            print("Yes")
        else:
            print("No")