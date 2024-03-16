import sys

class p02332:

    def __init__(self):
        self.sc = FastScanner()

    def run(self):
        n = self.sc.nextInt()
        k = self.sc.nextInt()

        c = Combinatrics(k)

        print(c.