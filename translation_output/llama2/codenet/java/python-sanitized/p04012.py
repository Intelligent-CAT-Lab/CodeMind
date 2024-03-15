import java.util

class p04012:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        w = sc.next()
        c = w.toCharArray()
        a = 'a'
        acha = int(a)
        a = 'z'
        zcha = int(a)
        count = 0
        for i in range(acha, zcha + 1):
            for x in c:
                if x == (char)i:
                    count += 1
            if count % 2 == 1:
                print("No")
                return
            count = 0
        print("Yes")