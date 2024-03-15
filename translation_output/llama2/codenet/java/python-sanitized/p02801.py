import sys

s = sys.stdin.readline()
c = s[0]

out = 'b'

switch c:
    case 'a':
        out = 'b'
    case 'b':
        out = 'c'
    case 'c':
        out = 'd'
    case 'd':
        out = 'e'
    case 'e':
        out = 'f'
    case 'f':
        out = 'g'
    case 'g':
        out = 'h'
    case 'h':
        out = 'i'
    case 'j':
        out = 'k'
    case 'k':
        out = 'l'
    case 'l':
        out = 'm'
    case 'm':
        out = 'n'
    case 'n':
        out = 'o'
    case 'o':
        out = 'p'
    case 'p':
        out = 'q'
    case 'q':
        out = 'r'
    case 'r':
        out = 's'
    case 's':
        out = 't'
    case 't':
        out = 'u'
    case 'u':
        out = 'v'
    case 'v':
        out = 'w'
    case 'w':
        out = 'x'
    case 'x':
        out = 'y'
    case 'y':
        out = 'z'
    case 'z':
        out = 'a'

print(out)