import java.util

class p03610:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        s = sc.next()
        array = s.split("")

        for i in range(0, len(s), 2):
            print(array[i])