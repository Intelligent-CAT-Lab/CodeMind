import java.util.Scanner
import java.util.Stack

class p01641:
    sc = Scanner(System.in)

    def main(self):
        mem = [0] * 10
        pos = 0
        sb = StringBuilder()
        for c in sc.next().toCharArray():
            idx = (ord(c) - 33) // 10
            for i in range(abs(pos - idx)):
                sb.append('<' if idx < pos else '>')
            pos = idx
            for i in range(abs(mem[pos] - ord(c))):
                sb.append('-' if ord(c) < mem[pos] else '+')
            mem[pos] = ord(c)
            sb.append('.')
        print(sb)

p01641().main()