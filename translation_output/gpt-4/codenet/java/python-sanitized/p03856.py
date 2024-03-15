import sys

def main():
    # Since Python handles file I/O differently, we can read directly from stdin
    # Not translating the part of code dealing with "input.txt" and "output.txt"
    qq = sys.maxsize
    # qq = int(read_token()) # Uncomment this and comment above line if you want to read qq

    for casenum in range(1, qq + 1):
        s = read_line()
        good = ["dream", "dreamer", "erase", "eraser"]
        poss = [False] * (len(s) + 1)
        poss[0] = True
        for i in range(len(s)):
            if not poss[i]:
                continue
            for out in good:
                if i + len(out) > len(s):
                    continue
                match = sum(1 for a in range(len(out)) if out[a] == s[i+a])
                if match == len(out):
                    poss[i+match] = True
        print("YES" if poss[len(s)] else "NO")

def exit_immediately():
    sys.exit(0)

def read_long():
    return int(read_token())

def read_double():
    return float(read_token())

def read_int():
    return int(read_token())

def read_line():
    s = sys.stdin.readline()
    if s == '':
        exit_immediately()
    return s.strip()

def read_token():
    global buffer
    if not buffer:
        buffer = sys.stdin.readline().strip().split()
    while not buffer:
        line = sys.stdin.readline().strip()
        if line == '':
            exit_immediately()
        buffer = line.split()
    return buffer.pop(0)

if __name__ == '__main__':
    buffer = []
    main()