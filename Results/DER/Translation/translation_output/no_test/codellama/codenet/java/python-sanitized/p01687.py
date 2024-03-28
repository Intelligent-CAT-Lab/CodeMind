import java.util.*;

class p01687:
    def main(self):
        self.run()

    def run(self):
        scan = Scanner(System.in)
        mstr = "AADINNUY"
        nstr = "AIZUNYAN"
        t = "AAAAAAAA".toCharArray()
        tt = ""
        while scan.hasNext():
            dstr = scan.next()
            if len(dstr) < 8:
                print(dstr)
                continue
            for i in range(len(dstr) - 7):
                t = dstr[i:i+8].toCharArray()
                tt = String.valueOf(t)
                sort(t)
                if mstr == String.valueOf(t):
                    dstr = dstr.replace(tt, nstr)
                    i += 7
            print(dstr)

    def sort(self, t):
        for i in range(len(t)):
            for j in range(len(t) - 1, i, -1):
                if t[i] > t[j]:
                    a = t[i]
                    t[i] = t[j]
                    t[j] = a
        return t