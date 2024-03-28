import sys

def is_latin_letter(c):
    return 'a' <= c <= 'z'

def is_special_char(c):
    if c == '.': return True
    if c == ',': return True
    if c == '!': return True
    if c == '?': return True
    return False

def main():
    s = sys.stdin.readline().strip()
    result = [s[0]]
    for i in range(1, len(s)):
        c = s[i]
        if is_latin_letter(c):
            if not is_latin_letter(s[i - 1]):
                result.append(' ')
            result.append(c)
        elif is_special_char(c):
            result.append(c)
    print(''.join(result))

if __name__ == "__main__":
    main()