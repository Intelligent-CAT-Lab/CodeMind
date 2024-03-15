import java.util

class p02723:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        s = sc.next()
        if s[2] == s[3] and s[4] == s[5]:
            print("Yes")
        else:
            print("No")