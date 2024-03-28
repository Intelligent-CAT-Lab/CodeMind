from io import BytesIO
import sys
import math

input = sys.stdin.buffer.read()
input_ptr = 0
sin_values = []

def solve():
    global input_ptr
    n = read_int()
    K = read_int()
    K -= 1
    sin_values = [math.sin(2*math.pi*i/n)/2 for i in range(n+1)]
    
    low, high = 0, 2*math.pi
    for _ in range(50):
        h = (low + high) / 2
        if count(h, n) <= K:
            low = h
        else:
            high = h
    print('%.14f' % high)

def count(h, n):
    ret = 0
    for length in range(1, n):
        low, high = 0, (n - length) // 2 + 1
        while high - low > 1:
            q = (low + high) // 2
            if S(length, q, n - length - q) <= h:
                low = q
            else:
                high = q
        ret += low * 2
        if low == (n - length) // 2 and (n - length) % 2 == 0:
            ret -= 1
    assert ret * n % 3 == 0
    return ret * n // 3

def S(a, b, c):
    return sin_values[a] + sin_values[b] + sin_values[c]

def read_int():
    global input_ptr
    num = 0
    while input_ptr < len(input) and not input[input_ptr].isdigit():
        input_ptr += 1
    while input_ptr < len(input) and input[input_ptr].isdigit():
        num = num * 10 + int(input[input_ptr]) - int('0')
        input_ptr += 1
    return num

def read_long():
    return read_int()

solve()