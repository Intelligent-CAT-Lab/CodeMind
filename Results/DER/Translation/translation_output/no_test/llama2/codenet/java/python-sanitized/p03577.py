import java.util

class p03577:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        line = sc.next()
        length = len(line)
        print(line[:length-8])