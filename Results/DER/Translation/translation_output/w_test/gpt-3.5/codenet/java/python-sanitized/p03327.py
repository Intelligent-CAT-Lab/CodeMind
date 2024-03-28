import sys

MOD = 1000000007
MAX = 2147483646

class p03327:
    def main(self):
        saori = hayami()
        n = saori.saori_hayami()
        if n < 1000:
            print("ABC")
        else:
            print("ABD")
        
        saori.close()

class hayami:
    def __init__(self):
        self.inp = sys.stdin.buffer
        self.buffer = bytearray()
        self.pos = 0
        self.size = 0

    def has_next(self):
        if self.pos < self.size:
            return True
        else:
            self.pos = 0
            self.size = self.inp.readinto(self.buffer)
            if self.size <= 0:
                return False
        return True
    
    def next_int(self):
        if self.has_next():
            return self.buffer[self.pos]
        else:
            return -1
    
    def is_valid_char(self, char):
        return 33 <= char and char <= 126

    def find_valid_char(self):
        while self.has_next() and not self.is_valid_char(self.buffer[self.pos]):
            self.pos += 1
        return self.has_next()

    def next_string(self):
        if not self.find_valid_char():
            raise StopIteration
        result = bytearray()
        char = self.next_int()
        while self.is_valid_char(char):
            result.append(char)
            char = self.next_int()
        return result.decode()

    def next_long(self):
        if not self.find_valid_char():
            raise StopIteration
        result = 0
        negative = False
        char = self.next_int()
        if char == 45:  # '-'
            negative = True
            char = self.next_int()
        if char < 48 or char > 57:  # '0' to '9'
            raise ValueError
        while True:
            if 48 <= char and char <= 57:  # '0' to '9'
                result *= 10
                result += char - 48
            elif char == -1 or not self.is_valid_char(char):
                return -result if negative else result
            else:
                raise ValueError
            char = self.next_int()
    
    def next_int(self):
        long_val = self.next_long()
        if long_val < -2147483648 or long_val > 2147483647:
            raise ValueError
        return int(long_val)

    def next_float(self):
        return float(self.next_string())

    def close(self):
        self.inp.close()

if __name__ == "__main__":
    p = p03327()
    p.main()