import itertools

def combinations_of_set_bits(n, k):
    for bit in range(1 << n):
        if bin(bit).count('1') != k:
            continue
        print(f"{bit}:", end="")
        for j in range(n):
            if (bit >> j) & 1:
                print(f" {j}", end="")
        print()

# Sample test case
input_string = "5 3"
n, k = map(int, input_string.split())
combinations_of_set_bits(n, k)