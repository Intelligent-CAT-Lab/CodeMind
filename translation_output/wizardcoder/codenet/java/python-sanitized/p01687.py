import java.util.*;

public class p01687:
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
            for i in range(dstr.length()-7):
                t = dstr.substring(i,i+8).toCharArray()
                tt = String.valueOf(t)
                self.sort(t)
                if mstr.equals(String.valueOf(t)):
                    dstr = dstr.replace(tt,nstr)
                    i += 7
            print(dstr)

    def sort(self, t):
        for i in range(len(t)):
            for j in range(len(t)-1,i,-1):
                if t[i] > t[j]:
                    a = t[i]
                    t[i] = t[j]
                    t[j] = a
        return t