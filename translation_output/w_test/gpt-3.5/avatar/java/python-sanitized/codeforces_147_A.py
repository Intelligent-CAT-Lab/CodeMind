def is_latin_letter(c):
    return 'a' <= c <= 'z'

def is_special_character(c):
    return c in ['.', ',', '!', '?']

if __name__ == "__main__":
    s = input()
    result = [s[0]]
    
    for i in range(1, len(s)):
        if is_latin_letter(s[i]):
            if not is_latin_letter(s[i - 1]):
                result.append(' ')
            result.append(s[i])
        elif is_special_character(s[i]):
            result.append(s[i])
    
    print(''.join(result))