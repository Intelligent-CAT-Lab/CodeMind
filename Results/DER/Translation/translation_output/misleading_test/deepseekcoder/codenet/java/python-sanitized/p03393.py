import string

def solve(line):
    set_chars = set(string.ascii_lowercase)
    for ch in line:
        set_chars.remove(ch)
    if set_chars:
        return line + set_chars.pop()
    if line == 'zyxwvutsrqponmlkjihgfedcba':
        return -1
    return next_lexicographical(line, '')

def next_lexicographical(line, cur):
    if line.startswith(cur) and len(line) > len(cur):
        return None
    if len(line) == len(cur):
        if line < cur:
            return cur
        else:
            return None
    for ch in string.ascii_lowercase:
        if ch not in cur:
            res = next_lexicographical(line, cur + ch)
            if res:
                return res
    return None

if __name__ == "__main__":
    line = input()
    result = solve(line)
    if isinstance(result, int):
        print(result)
    else:
        print(result)