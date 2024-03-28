def compute():
    import sys
    import string

    def shift_char(c, shift):
        if c.isalpha():
            ascii_offset = ord('a') if c.islower() else ord('A')
            return chr((ord(c) - ascii_offset + shift) % 26 + ascii_offset)
        return c

    def shift_string(s, shift):
        return ''.join(shift_char(c, shift) for c in s)

    for line in sys.stdin:
        for i in range(26):
            converted = shift_string(line.strip(), i)
            if 'the' in converted or 'this' in converted or 'that' in converted:
                print(converted)
                break

compute()