import sys

def main():
    s = sys.stdin.read().strip()
    c = s[0]
    out = ''
    switcher = {
        'a': 'b',
        'b': 'c',
        'c': 'd',
        'd': 'e',
        'e': 'f',
        'f': 'g',
        'g': 'h',
        'h': 'i',
        'j': 'k',
        'k': 'l',
        'l':'m',
       'm': 'n',
        'n': 'o',
        'o': 'p',
        'p': 'q',
        'q': 'r',
        'r':'s',
       's': 't',
        't': 'u',
        'u': 'v',
        'v': 'w',
        'w': 'x',
        'x': 'y',
        'y': 'z',
    }
    out = switcher.get(c, 'Invalid input')
    print(out)

if __name__ == "__main__":
    main()