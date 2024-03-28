import sys

class TaskX:
    def solve(self, test_number, in, out):
        s = in.next_string().to_char_array()
        n = s.length
        ac = [0] * (n + 1)
        bc = [0] * (n + 1)
        cc = [0] * (n + 1)
        xc = [0] * (n + 1)
        for i in range(n):
            ac[i + 1] += ac[i]
            bc[i + 1] += bc[i]
            cc[i + 1] += cc[i]
            xc[i + 1] += xc[i]
            if s[i] == 'A':
                ac[i + 1] += 1
            elif s[i] == 'B':
                bc[i + 1] += 1
            elif s