import java.io.IOException
import java.io.InputStream
import java.util.NoSuchElementException

class p04030:

    def main(self):
        sc = FastScanner()
        s = sc.next()
        t = ""
        for i in range(s.length()):
            if s.charAt(i)!= 'B':
                t += s[i]
            elif t == "":
                continue
            else:
                t = t[:-1]
        print(t)

    # ä»¥ä¸ãèªä½ã©ã¤ãã©ãª

    # éä¹
    def fact(self, n):
        if n == 1