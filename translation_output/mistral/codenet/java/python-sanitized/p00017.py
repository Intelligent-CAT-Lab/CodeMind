import re

class p00017:

    def __init__(self):
        self.sc = input()
        self.sc.useDelimiter("[\n]+")
        self.stack = []

    def compute(self):
        while self.sc.hasNext():
            S = self.sc.next()
            for i in range(26):
                converted = ""
                for j in range(len(S)):
                    c = S[j]
                    if c >= 'a' and c <= 'z':
                        converted += chr((ord(c) + i) % 26 + ord('a'))
                    else:
                        converted += chr(ord(c))
                if "the" in converted or "this" in converted or "that" in converted:
                    print(converted)
                    break

p00017 = p00017()
p00017.compute()