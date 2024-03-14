import java.util.*;

class p03610:
    def main(self):
        sc = Scanner(System.in)
        s = sc.next()
        array = s.split("")

        for i in range(0, s.length(), 2):
            System.out.print(array[i])