import sys

MOD = 1_000_000_007
MAX = 2_147_483_646

class p02633:
    def main(self):
        saori = hayami()
        n = saori.saori_hayami()
        i = 1
        while True:
            if i*n % 360 == 0:
                print(i)
                return
            i += 1

class hayami:
    def __init__(self):
        self.inp = sys.stdin.buffer
        self.hayami = []
        self.idx = 0
        self.size = 0

    def hayami_saori(self):
        if self.idx < self.size:
            return True
        else:
            self.idx = 0
            self.hayami = self.inp.read(1024)
            self.size = len(self.hayami)
            if self.size <= 0:
                return False
        return True

    def saori_hayami(self):
        if self.hayami_saori():
            return self.hayami[self.idx]
        else:
            return -1

    def hayami_saori_check(self, val):
        return 33 <= val <= 126

    def read_next_hayami(self):
        while self.hayami_saori() and not self.hayami_saori_check(self.hayami[self.idx]):
            self.idx += 1
        return self.hayami_saori()

    def next_hayami(self):
        if not self.read_next_hayami():
            raise StopIteration
        hayamin = []
        val = self.saori_hayami()
        while self.hayami_saori_check(val):
            hayamin.append(val)
            val = self.saori_hayami()
        return bytes(hayamin).decode()

    def read_next_long(self):
        if not self.read_next_hayami():
            raise StopIteration
        hayami = 0
        negative = False
        val = self.saori_hayami()
        if val == 45:
            negative = True
            val = self.saori_hayami()
        if not (48 <= val <= 57):
            raise ValueError
        while True:
            if 48 <= val <= 57:
                hayami *= 10
                hayami += val - 48
            elif val == -1 or not self.hayami_saori_check(val):
                return -hayami if negative else hayami
            else:
                raise ValueError
            val = self.saori_hayami()

    def saori_hayami(self):
        long_val = self.read_next_long()
        if long_val < -2147483648 or long_val > 2147483647:
            raise ValueError
        return int(long_val)

    def next_double(self):
        return float(self.next_hayami())

if __name__ == '__main__':
    task = p02633()
    task.main()