import sys

class Hayami:
    def __init__(self):
        self.input_stream = sys.stdin.buffer
        self.buffer = bytearray()
        self.buffer_index = 0
        self.buffer_size = 0

    def has_next(self):
        if self.buffer_index < self.buffer_size:
            return True
        else:
            self.buffer_index = 0
            self.buffer = self.input_stream.read(1024)
            self.buffer_size = len(self.buffer)
            if self.buffer_size <= 0:
                return False
        return True

    def get_next_byte(self):
        if self.has_next():
            return self.buffer[self.buffer_index]
        else:
            return -1

    def is_valid_byte(self, byte_value):
        return 33 <= byte_value <= 126

    def find_next_byte(self):
        while self.has_next() and not self.is_valid_byte(self.buffer[self.buffer_index]):
            self.buffer_index += 1
        return self.has_next()

    def next_valid_chars(self):
        if not self.find_next_byte():
            raise StopIteration("No valid chars.")
        result = bytearray()
        byte_value = self.get_next_byte()
        while self.is_valid_byte(byte_value):
            result.append(byte_value)
            byte_value = self.get_next_byte()
        return result.decode('utf-8')

    def next_long(self):
        if not self.find_next_byte():
            raise StopIteration("No valid chars.")
        number = 0
        negative = False
        byte_value = self.get_next_byte()
        if byte_value == ord('-'):
            negative = True
            byte_value = self.get_next_byte()
        if not ord('0') <= byte_value <= ord('9'):
            raise ValueError("Invalid character for number.")
        while True:
            if ord('0') <= byte_value <= ord('9'):
                number *= 10
                number += byte_value - ord('0')
            elif byte_value == -1 or not self.is_valid_byte(byte_value):
                return -number if negative else number
            else:
                raise ValueError("Invalid character for number.")
            byte_value = self.get_next_byte()

    def next_int(self):
        long_number = self.next_long()
        if long_number < -2147483648 or long_number > 2147483647:
            raise ValueError("Number out of integer range.")
        return int(long_number)

    def next_double(self):
        return float(self.next_valid_chars())

def main():
    saori = Hayami()
    n = saori.next_int()
    
    if n < 1000:
        print("ABC")
    else:
        print("ABD")
        
    saori.input_stream.close()

if __name__ == "__main__":
    main()