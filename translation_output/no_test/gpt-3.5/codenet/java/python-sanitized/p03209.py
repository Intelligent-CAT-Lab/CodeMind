import sys


class Scanner:
    def __init__(self, input_file=None):
        if input_file:
            self.input_buffer = input_file.split()
        else:
            self.input_buffer = sys.stdin.read().split()
        self.pointer = 0

    def next(self):
        result = self.input_buffer[self.pointer]
        self.pointer += 1
        return result

    def nextArray(self, length):
        result = self.input_buffer[self.pointer:self.pointer+length]
        self.pointer += length
        return result

    def nextDouble(self):
        return float(self.next())

    def nextDoubleArray(self, length):
        result = [float(x) for x in self.nextArray(length)]
        return result

    def nextInt(self):
        return int(self.next())

    def nextIntArray(self, length):
        result = [int(x) for x in self.nextArray(length)]
        return result

    def nextLong(self):
        return int(self.next())

    def nextLongArray(self, length):
        result = [int(x) for x in self.nextArray(length)]
        return result


def main():
    sc = Scanner()
    n = sc.nextInt()
    x = sc.nextLong()

    print(calc(n, x))


def calc(n, x):
    if n == 0:
        return 1
    sum = 0
    x -= 1
    length = length_func(n-1)
    p_val = p_func(n-1)
    if x > 0:
        if length <= x:
            sum += p_val
        else:
            sum += calc(n-1, x)
        x -= length
    if x > 0:
        x -= 1
        sum += 1
    if x > 0:
        if length <= x:
            sum += p_val
        else:
            sum += calc(n-1, x)

    return sum


def length_func(n):
    return 1 + 4 * (2**n - 1)


def p_func(n):
    return 1 + 2 * (2**n - 1)


if __name__ == "__main__":
    main()