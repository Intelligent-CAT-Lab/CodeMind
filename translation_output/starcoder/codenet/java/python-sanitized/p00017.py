import java.util.Scanner;
import java.util.Stack;

class p00017:

    def compute(self):
        sc = Scanner(System.in)
        sc.useDelimiter("[\n]+")
        while sc.hasNext():
            S = sc.next()
            for i in range(26):
                converted = ""
                for j in range(len(S)):
                    c = S.charAt(j)
                    if c >= 'a' and c <= 'z':
                        converted += (char) (c + i <= 'z'? c + i : c + i - 26)
                    else:
                        converted += (char) c
                if converted.contains("the") or converted.contains("this") or converted.contains("that"):
                    print converted
                    break

p00017().compute()