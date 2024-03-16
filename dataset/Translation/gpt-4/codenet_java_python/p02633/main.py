import sys

MOD = 1_000_000_007  # 10^9+7
MAX = 2_147_483_646  # intMax


class Hayami:
    def __enter__(self):
        return self

    def __exit__(self, exc_type, exc_value, traceback):
        pass

    def hayami_saori(self, char):
        return 33 <= char <= 126

    def hayamisaori(self):
        char = self._read_char()
        while char != '' and not self.hayami_saori(ord(char)):
            char = self._read_char()
        return char != ''

    def next_hayami(self):
        char = self._read_char_while_ignoring()
        if char == '':
            raise StopIteration
        hayamin = []
        while self.hayami_saori(ord(char)):
            hayamin.append(char)
            char = self._read_char()
        return ''.join(hayamin)

    def saori_hayami(self):  # nextInt
        return int(self.next_hayami())

    def saorihayami(self):  # nextLong
        number_string = self.next_hayami()
        return int(number_string)

    def hayamin(self):  # nextDouble
        return float(self.next_hayami())

    def _read_char(self):
        return sys.stdin.read(1) if not sys.stdin.closed else ''

    def _read_char_while_ignoring(self):
        char = self._read_char()
        while char != '' and not self.hayami_saori(ord(char)):
            char = self._read_char()
        return char


def main():
    with Hayami() as saori:
        n = saori.saori_hayami()
        i = 1
        while True:
            if i * n % 360 == 0:
                print(i)
                return
            i += 1


if __name__ == "__main__":
    main()