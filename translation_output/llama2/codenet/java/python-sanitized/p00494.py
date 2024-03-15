import java.util.Scanner;

class p00494:

    def __init__(self):
        self.sc = Scanner(System.in)

    def main(self):
        str = ("$" + self.sc.next() + "$").toCharArray()
        ans = 0
        s = 0
        for i in range(1, len(str)):
            if str[i] == 'O' and str[i - 1] != 'O':
                s = i
            if str[i] == 'O' and str[i + 1] != 'O':
                l = i - s + 1
                if s >= l and len(str) - i - 1 >= l:
                    ok = True
                    for j in range(0, l):
                        if str[s - 1 - j] != 'J' or str[i + 1 + j] != 'I':
                            ok = False
                            break
                    if ok:
                        ans = max(ans, l)
        print(ans)