import sys

def solve(line):
    set_chars = set(chr(i) for i in range(ord('a'), ord('z')+1))
    for ch in line:
        set_chars.discard(ch)
    if set_chars:
        print(line + min(set_chars))
        return
    if line == "zyxwvutsrqponmlkjihgfedcba":
        print(-1)
        return
    next_line(line, "")

def next_line(line, cur):
    if line.startswith(cur):
        return False
    if len(line) == len(cur):
        if line < cur:
            for i in range(len(line)):
                sys.stdout.write(cur[i])
                if line[i] != cur[i]:
                    break
            print("")
            return True
        else:
            return False
    for ch in range(ord('a'), ord('z')+1):
        if chr(ch) not in cur:
            if next_line(line, cur + chr(ch)):
                return True
    return False

def main():
    line = sys.stdin.readline().strip()
    solve(line)

if __name__ == "__main__":
    main()