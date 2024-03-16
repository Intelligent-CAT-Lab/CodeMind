def sequence_length(seed):
    sequence = set()
    sequence.add(seed)
    i = 1
    while True:
        i += 1
        if seed % 2 == 0:
            seed = seed // 2
        else:
            seed = 3 * seed + 1
        if seed in sequence:
            return i
        else:
            sequence.add(seed)

if __name__ == "__main__":
    s = int(input())
    print(sequence_length(s))