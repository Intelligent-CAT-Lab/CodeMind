import sys

class Scanner:
    def __init__(self):
        self.stdin = sys.stdin
        self.buffer = ""
        self.ptr = 0

    def read(self):
        while not self.buffer or self.ptr >= len(self.buffer):
            self.buffer = self.stdin.readline().strip()
            self.ptr = 0
        self.ptr += 1
        return self.buffer[self.ptr-1]

    def nextInt(self):
        return int(self.read())

def upper_bound(arr, val):
    return upper_bound_helper(arr, 0, len(arr), val)

def upper_bound_helper(arr, l, r, val):
    if r - l == 1:
        if arr[l] > val:
            return l
        return r
    mid = (l + r) // 2
    if arr[mid] > val:
        return upper_bound_helper(arr, l, mid, val)
    else:
        return upper_bound_helper(arr, mid, r, val)

def lower_bound(arr, val):
    return lower_bound_helper(arr, 0, len(arr), val)

def lower_bound_helper(arr, l, r, val):
    if r - l == 1:
        if arr[l] < val:
            return r
        return l
    mid = (l + r) // 2
    if arr[mid] < val:
        return lower_bound_helper(arr, mid, r, val)
    else:
        return lower_bound_helper(arr, l, mid, val)

def max_val(a, b):
    return max(a, b)

def min_val(a, b):
    return min(a, b)

def abs_val(a):
    return abs(a)

def print_val(value):
    print(value, end='')

def put_val(value):
    print(value)

def main():
    scanner = Scanner()
    x = scanner.nextInt()
    y = scanner.nextInt()
    put_val(x + y // 2)

if __name__ == '__main__':
    main()