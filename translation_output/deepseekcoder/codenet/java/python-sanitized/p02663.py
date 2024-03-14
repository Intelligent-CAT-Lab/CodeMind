import sys

def next_int(scanner):
    return int(scanner.readline())

def main():
    scanner = sys.stdin
    h1 = next_int(scanner)
    m1 = next_int(scanner)
    h2 = next_int(scanner)
    m2 = next_int(scanner)
    k = next_int(scanner)
    h = h2 - h1
    m = m2 - m1
    day = (h * 60) + m
    print(day - k)

if __name__ == "__main__":
    main()