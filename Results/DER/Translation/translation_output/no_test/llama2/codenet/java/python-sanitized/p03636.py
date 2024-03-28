import java.util

class p03636:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        s = sc.next()
        leng = len(s)
        print(s[0], leng-2, s[leng-1])