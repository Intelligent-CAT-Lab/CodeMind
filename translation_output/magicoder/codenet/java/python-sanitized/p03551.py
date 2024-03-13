class p03551:

    def __init__(self):
        self.sc = self.Scanner(System.in)

    def run(self):
        n = self.sc.nextInt()
        m = self.sc.nextInt()

        base = n*100+m*1800

        print(base << m)


p03551 m = p03551()
m.run()