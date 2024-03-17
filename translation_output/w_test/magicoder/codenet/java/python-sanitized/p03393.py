import sys

def solve(line):
    set_chars = set(chr(i) for i in range(ord('a'), ord('z')+1))
    for ch in line:
        set_chars.discard(ch)
    if set_chars:
        return line + min(set_chars)
    elif line == 'zyxwvutsrqponmlkjihgfedcba':
        return -1
    else:
        return next_permutation(line)

def next_permutation(line):
    for i in range(len(line)-1, 0, -1):
        if line[i] > line[i-1]:
            for j in range(len(line)-1, i-1, -1):
                if line[j] > line[i-1]:
                    line = line[:i-1] + line[j] + line[i:j] + line[i-1] + line[j+1:]
                    return line
    return line

def main():
    line = sys.stdin.readline().strip()
    print(solve(line))

if __name__ == "__main__":
    main()