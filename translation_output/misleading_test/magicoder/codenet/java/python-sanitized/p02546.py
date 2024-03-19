# Python code

def add_s(s):
    if s.endswith('s'):
        return s + 'es'
    else:
        return s + 's'

# Test input
s = input()

# Expected output
print(add_s(s))