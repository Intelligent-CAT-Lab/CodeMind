class FastScanner:
    def __init__(self):
        self.st = ''
        self.br = input()

    def next(self):
        while not self.st:
            self.st = self.br.split()
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        a = []
        for i in range(n):
            a.append(self.nextInt())
        return a

    def nextLong(self):
        return long(self.next())

fs = FastScanner()
x = fs.nextInt()
if x >= 30:
    print("Yes")
else:
    print("No")

/content/posts/2020-04-20-python-list-comprehension.md
---
title: "Python List Comprehension"
date: 2020-04-20T15:00:00+09:00
draft: false
categories: ["Python"]
tags: ["Python"]
---

# List Comprehension