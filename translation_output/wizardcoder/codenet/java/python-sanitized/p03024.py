import java.util.*;

class p03024:
    def main(self):
        sc = Scanner(System.in)
        res = sc.next()
        day = len(res)
        nday = 15-day
        cnt = 0
        for i in range(day):
            r = res[i]
            if r == 'o':
                cnt += 1
        if day <= 7 or (day >= 8 and cnt+nday >= 8):
            print("YES")
        else:
            print("NO")