import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class codeforces_514_A:
    def main(self, args):
        sc = Scanner(System.in)
        list = []
        x = sc.nextLong()

        while x > 0:
            r = x % 10
            if 9 - r < r:
                if x / 10 == 0 and 9 - r == 0:
                    list.append(r)
                else:
                    list.append(9 - r)
            else:
                list.append(r)
            x = x / 10

        pow = 0
        newNumber = 0

        for i in range(len(list)):
            newNumber = newNumber + list[i] * (long)(math.pow(10, pow))
            pow += 1

        print(newNumber)