```python
class p02633:
    MOD = 10**9 + 7
    MAX = 2_147_483_646
    INF = 10**9

    def main(self):
        saori = Hayami()
        n = saori.saori_hayami()
        saori.close()
        i = 1
        while True:
            if i * n % 360 == 0:
                print(i)
                return
            i += 1

class Hayami:
    def __init__(self):
        self.in_stream = open(0)
        self.buffer = bytearray()
        self.buf_idx = 0
        self.buf_size = 0

    def read_buffer(self):
        if self.buf_idx < self.buf_size:
            return True
        else:
            self.buf_idx = 0
            self.buffer = self.in_stream.read(1024)
            self.buf_size = len(self.buffer)
            return self.buf_size > 0

    def read_byte(self):
        if self.read_buffer():
            return self.buffer[self.buf_idx]
        else:
            return -1

    def is_valid_byte(self, byte_val):
        return 33 <= byte_val <= 126

    def read_valid_byte(self):
        while self.read_buffer() and not self.is_valid_byte(self.buffer[self.buf_idx]):
            self.buf_idx += 1
        return self.read_buffer()

    def read_string(self):
        if not self.read_valid_byte():
            raise StopIteration()
        
        string = bytearray()
        byte_val = self.read_byte()
        while self.is_valid_byte(byte_val):
            string.append(byte_val)
            byte_val = self.read_byte()
        return string.decode()

    def read_int(self):
        if not self.read_valid_byte():
            raise StopIteration()
        
        num = 0
        negative = False
        byte_val = self.read_byte()
        if byte_val == ord('-'):
            negative = True
            byte_val = self.read_byte()
        
        if not ord('0') <= byte_val <= ord('9'):
            raise ValueError()

        while True:
            if ord('0') <= byte_val <= ord('9'):
                num *= 10
                num += byte_val - ord('0')
            elif byte_val == -1 or not self.is_valid_byte(byte_val):
                return -num if negative else num
            else:
                raise ValueError()
            byte_val = self.read_byte()

    def close(self):
        self.in_stream.close()


if __name__ == '__main__':
    p = p02633()
    p.main()
```
