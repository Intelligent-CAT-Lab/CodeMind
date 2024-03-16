import java.util.Scanner
import java.util.Stack

class p00017:

    def __init__(self):
        self.sc = Scanner(System.in)
        self.sc.useDelimiter("[\n]+")

    def compute(self):
        while self.sc.hasNext():
            S = self.sc.next()
            for i in range(26):
                converted = ""
                for j in range(len(S)):
                    c = S[j]
                    if c >= 'a' and c <= 'z':
                        converted += chr(ord(c) + i if ord(c) + i <= ord('z') else ord(c) + i - 26)
                    else:
                        converted += c
                if "the" in converted or "this" in converted or "that" in converted:
                    print(converted)
                    break

    def main(self):
        self.compute()

p00017().main()