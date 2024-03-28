import java.util

class p02903:
    def main(self, args):
        sc = java.util.Scanner(java.lang.System.in)
        h = int(sc.next())
        w = int(sc.next())
        a = int(sc.next())
        b = int(sc.next())
        #c = [[] for _ in range(h)]
        s1 = ""
        s2 = ""
        
        for j in range(w):
            if j < a:
                s1 = s1 + "0"
                s2 = s2 + "1"
            else:
                s1 = s1 + "1"
                s2 = s2 + "0"
        
        for i in range(h):
            if i < b:
                print(s1)
            else:
                print(s2)
        
        #for i in range(h):
        #    for j in range(w):
        #        print(c[i][j])
        
p02903().main(None)