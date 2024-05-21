def is_latin_letter(c):
    return 'a' <= c <= 'z'

def is_codeforces_147_A(c):
    if c == '.': return True
    if c == ',': return True
    if c == '!': return True
    if c == '?': return True
    return False

def main():
    s = input()
    sb = s[0]
    for i in range(1, len(s)):
        c = s[i]
        if is_latin_letter(c):
            if not is_latin_letter(s[i - 1]):
                sb += ' '
            sb += c
        elif is_codeforces_147_A(c):
            sb += c
    print(sb)

if __name__ == "__main__":
    main()