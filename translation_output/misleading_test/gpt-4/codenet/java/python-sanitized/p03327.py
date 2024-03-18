import sys

MOD = 1_000_000_007  # 10^9+7
MAX = 2_147_483_646  # intMax


class Hayami:
    def __init__(self):
        self._input_stream = sys.stdin.buffer
        self._hayami_buffer = bytearray(1024)
        self._hayami_read = 0
        self._saori_read = 0

    def hayami_saori(self, hayami):
        return 33 <= hayami <= 126

    def hayami_saori_advance(self):
        if self._hayami_read < self._saori_read:
            return True
        else:
            self._hayami_read = 0
            self._saori_read = self._input_stream.readinto(self._hayami_buffer)
            return self._saori_read > 0

    def saori_hayami_advance(self):
        if self.hayami_saori_advance():
            return self._hayami_buffer[self._hayami_read]
        else:
            return -1

    def next_token(self):
        while not self.hayami_saori(self.saori_hayami_advance()):
            self._hayami_read += 1
        token = []
        c = self.saori_hayami_advance()
        while self.hayami_saori(c):
            token.append(c)
            c = self.saori_hayami_advance()
        return bytes(token).decode()

    def next_int(self):
        token = self.next_token()
        try:
            return int(token)
        except ValueError:
            raise Exception("Invalid input for integer: '{}'".format(token))


def main():
    saori = Hayami()
    n = saori.next_int()

    if n < 1000:
        print("ABC")
    else:
        print("ABD")


if __name__ == '__main__':
    main()