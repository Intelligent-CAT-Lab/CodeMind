# Python code

def count_zeros_and_ones(tail):
    n = len(tail)
    tailsp = list(tail)
    zero = "0"
    one = "1"
    count = 0
    for i in range(n):
        if i % 2 == 0 and tailsp[i] == zero:
            count += 1
        if i % 2 == 1 and tailsp[i] == one:
            count += 1
    n -= count
    if count > n:
        return n
    else:
        return count

tail = input()
print(count_zeros_and_ones(tail))