import sys

class Task:
    def solve(self, inp, out):
        S = inp.next()
        while len(S) > 3:
            abc = False
            for i in range(len(S) - 2):
                if S[i:i+3] == "ABC":
                    S = S[:i] + "X" + S[i+3:]
                    abc = True
            if not abc:
                out.write("No\n")
                return

            check = [False] * 3
            for c in S:
                if ord(c) - ord('A') < 3:
                    check[ord(c) - ord('A')] = True
            cnt = sum(check)
            if cnt != 2:
                out.write("No\n")
                return
            for i in range(3):
                if not check[i]:
                    c = chr(i + ord('A'))
                    S = S.replace("X", c)
        
        if S == "ABC":
            out.write("Yes\n")
        else:
            out.write("No\n")

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buffer_length = 0

    def has_next_byte(self):
        if self.ptr < self.buffer_length:
            return True
        else:
            self.ptr = 0
            try:
                self.buffer_length = self.inp.readinto(self.buffer)
            except IOError as e:
                print(e)
                sys.exit(1)
            if self.buffer_length <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte(): return self.buffer[self.ptr]
        else: return -1

    def skip_unprintable(self