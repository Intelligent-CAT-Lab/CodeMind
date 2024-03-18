import sys

MOD = 1_000_000_007  # 10^9+7
MAX = 2_147_483_646  # intMax


def main():
    reader = Hayami()
    n = reader.saori_hayami()
    reader.close()
    i = 1
    while True:
        if i * n % 360 == 0:
            print(i)
            return
        i += 1


class Hayami:
    def __init__(self):
        self.input_stream = sys.stdin.buffer

    def hayami_saori(self, char):
        return 33 <= char <= 126

    def hayamisaori(self):
        char = self.input_stream.peek(1)[:1]
        if char == b'':
            return False
        while char and not self.hayami_saori(char[0]):
            self.input_stream.read(1)
            char = self.input_stream.peek(1)[:1]
        return char != b''

    def next_hayami(self):
        if not self.hayamisaori():
            raise EOFError()
        result = []
        char = self.input_stream.read(1)
        while self.hayami_saori(char[0]):
            result.append(char.decode('ascii'))
            char = self.input_stream.read(1)
        return ''.join(result)

    def saorihayami(self):
        if not self.hayamisaori():
            raise EOFError()
        result = 0
        negative = False
        char = self.input_stream.read(1)
        if char == b'-':
            negative = True
            char = self.input_stream.read(1)
        if not b'0' <= char <= b'9':
            raise ValueError()
        while b'0' <= char <= b'9':
            result = result * 10 + int(char) - int(b'0')
            char = self.input_stream.peek(1)[:1]
            if char == b'' or not self.hayami_saori(char[0]):
                return -result if negative else result
            char = self.input_stream.read(1)
        raise ValueError()

    def saori_hayami(self):
        result = self.saorihayami()
        if result < -2**31 or result >= 2**31:
            raise ValueError()
        return result
    
    def hayamin(self):
        return float(self.next_hayami())
    
    def close(self):
        pass  # no need to close sys.stdin in Python


if __name__ == "__main__":
    main()