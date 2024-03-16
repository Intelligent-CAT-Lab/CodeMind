import sys
import io
import re


class CDivisorGame:

    @staticmethod
    def solve():
        n = int(input())
        pf = {}
        i = 2
        while i * i <= n:
            c = 0
            while n % i == 0:
                n //= i
                c += 1
            if c > 0:
                pf[i] = c
            i += 1
        if n > 1:
            pf[n] = 1

        ans = 1
        for count in pf.values():
            ans *= (count + 1)

        LightWriter.ans(len(pf)).ans(ans - 1).ln()


class LightWriter:

    @staticmethod
    def ans(value):
        # Print on the same line with space separation for successive calls
        sys.stdout.write(' ')
        sys.stdout.write(str(value))
        return LightWriter

    @staticmethod
    def ln():
        # Print a new line after current output
        sys.stdout.write('\n')


# Debugging tool (unused in the translated Python code)
class Debug:
    enabled = False
    src = ''
    DEBUG_CALL_PATTERN = r'^.+\.debug\((.+)\);.*$'

    @staticmethod
    def enable(s):
        Debug.enabled = True
        Debug.src = s


def main():
    sys.stdin = io.StringIO(sys.stdin.read())
    CDivisorGame.solve()


if __name__ == '__main__':
    main()