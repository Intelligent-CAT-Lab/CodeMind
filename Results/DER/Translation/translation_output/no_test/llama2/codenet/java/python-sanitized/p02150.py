import java.util


class p02150:
    def __init__(self):
        self.MOD = 1000000007

    def main(self, args):
        a = int(args[0])
        b = int(args[1])
        x = int(args[2])
        s = a - b
        count = max(x - a, 0) // s
        total = (count % self.MOD) * (a % self.MOD) % self.MOD
        x -= count * s
        while x >= a:
            total += a
            x += - a + b
        total += x
        total %= self.MOD
        print(total)


if __name__ == '__main__':
    p02150().main(sys.argv[1:])