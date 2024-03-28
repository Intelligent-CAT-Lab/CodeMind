import sys

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in = input_stream.readline()
    n = 0
    for c in in:
        if c == '1':
            n += 1
    print(n)

if __name__ == '__main__':
    main()