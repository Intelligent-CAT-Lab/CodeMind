解析


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
  
  
class p01555:
     
    def count(self, s):
        p = 1
        cnt = 1
        res = 0
        while p * 10 < s:
            less3 = (p * 10 - 1) / 3 - (p - 1) / 3
            less5 = (p * 10 - 1) / 5 - (p - 1) / 5
            less15 = (p * 10 - 1) / 15 - (p - 1) / 15
            res += ((p * 10 - 1) - (p - 1) - less3 - less5 + less15) * cnt
            res += (less3 - less15) * 4
            res += (less5 - less15) * 4
            res += less15 * 8
            cnt += 1
            p *= 10
        less3 = (s - 1) / 3 - (p - 1) / 3
        less5 = (s - 1) / 5 - (p - 1) / 5
        less15 = (s - 1) / 15 - (p - 1) / 15
        res += ((s - 1) - (p - 1) - less3 - less5 + less15) * cnt
        res += (less3 - less15) * 4
        res += (less5 - less15) * 4
        res += less15 * 8
        return res
     
    def main(self, args):
        sc = Scanner(System.in)
        s = sc.nextLong()
        upper = s
        lower = 1
        while upper - lower > 1:
            med = (upper + lower) / 2
            dist = self.count(med)
            # System.out.println(upper + " " + lower + " " + med + " " + dist + " " + s)
            if dist > s:
                upper = med
            elif dist < s:
                lower = med
            else:
                upper = med
                lower = med - 1
        for i in range(lower, s + 1):
            str = None
            if i % 15 == 0:
                str = "FizzBuzz"
            elif i % 5 == 0:
                str = "Buzz"
            elif i % 3 == 0:
                str = "Fizz"
            else:
                str = str(i)
            ch = str.encode()
            for j in range(len(ch)):
                if cur < s:
                    # System.out.println(cur + " " + ch[j])
                    continue
                elif cur >= (s + 20):
                    System.out.println()
                    return
                else:
                    System.out.print(ch[j])