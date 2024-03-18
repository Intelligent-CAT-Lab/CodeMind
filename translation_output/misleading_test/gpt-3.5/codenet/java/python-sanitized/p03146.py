def collatz_sequence(s):
    set_nums = set()
    set_nums.add(s)
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        
        if s in set_nums:
            return i
        else:
            set_nums.add(s)

# Test case
s = int(input())
result = collatz_sequence(s)
print(result)