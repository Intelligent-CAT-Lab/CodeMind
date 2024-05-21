def collatz_sequence(s):
    sequence = set()
    sequence.add(s)
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        if s in sequence:
            return i
        else:
            sequence.add(s)

test_input = 8
print(collatz_sequence(test_input))