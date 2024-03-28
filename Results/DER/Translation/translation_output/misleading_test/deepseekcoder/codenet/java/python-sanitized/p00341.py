from collections import Counter

def check_sequence(seq):
    counter = Counter(seq)
    if len(counter) > 3:
        return "no"
    counts = list(counter.values())
    if 4 not in counts and 8 not in counts and 12 not in counts:
        return "no"
    return "yes"

def main():
    sequence = list(map(int, input().split()))
    if len(sequence) != 12:
        return "Invalid input"
    print(check_sequence(sequence))

if __name__ == "__main__":
    main()