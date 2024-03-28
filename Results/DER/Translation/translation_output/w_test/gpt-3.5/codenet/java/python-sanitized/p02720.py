import sys

class FasterScanner:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buffer = ''
    
    def read(self, size=1):
        while len(self.buffer) < size:
            self.buffer += self.input_stream.read(1024).decode()
        result = self.buffer[:size]
        self.buffer = self.buffer[size:]
        return result
    
    def nextInt(self):
        return int(self.read().strip())

def main():
    sc = FasterScanner(sys.stdin)

    k = sc.nextInt()
    lst = []
    for i in range(1, 10):
        lst.append(i)
    
    val = -1
    while k > 0:
        val = lst[0]
        lst.pop(0)
        if val % 10 != 0:
            lst.append(10 * val + val % 10 - 1)
        lst.append(10 * val + val % 10)
        if val % 10 != 9:
            lst.append(10 * val + val % 10 + 1)
        k -= 1

    print(val)

if __name__ == "__main__":
    main()