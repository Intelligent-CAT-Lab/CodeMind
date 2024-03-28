def compute():
    import sys
    import string

    def shift_char(c, shift):
        ascii_offset = ord('a')
        return chr((ord(c) - ascii_offset + shift) % 26 + ascii_offset)

    def shift_string(s, shift):
        return ''.join(shift_char(c, shift) if c in string.ascii_lowercase else c for c in s)

    for line in sys.stdin:
        line = line.strip()
        for i in range(26):
            converted = shift_string(line, i)
            if 'the' in converted or 'this' in converted or 'that' in converted:
                print(converted)
                break

compute()