import sys

MOD = 1_000_000_007
MAX = 2_147_483_646

class p02633:
    def main(self):
        n = self.saori_hayami()
        i = 1
        while True:
            if i * n % 360 == 0:
                print(i)
                return
            i += 1

    def saori_hayami(self):
        n = int(input())
        return n

if __name__ == "__main__":
    program = p02633()
    program.main()