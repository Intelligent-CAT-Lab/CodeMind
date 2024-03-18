import sys

def is_latin_letter(c):
    return 'a' <= c <= 'z'

def is_punctuation(c):
    return c in ['.', ',', '!', '?']

def main():
    s = input()
    result = [s[0]]
    n = len(s)
    
    for i in range(1, n):
        c = s[i]
        if is_latin_letter(c):
            if not is_latin_letter(s[i - 1]):
                result.append(' ')
            result.append(c)
        elif is_punctuation(c):
            result.append(c)
    
    print(''.join(result))

if __name__ == "__main__":
    main()