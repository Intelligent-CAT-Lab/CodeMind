import java.util.HashSet
import java.util.Scanner
import java.util.Set

class p03146:
    sc = Scanner(System.in)

    def main(self):
        s = sc.nextInt()
        set = HashSet()
        set.add(s)
        i = 1
        while True:
            i += 1
            if s % 2 == 0:
                s = s // 2
            else:
                s = 3 * s + 1
            if set.contains(s):
                print(i)
                return
            else:
                set.add(s)

p03146().main()