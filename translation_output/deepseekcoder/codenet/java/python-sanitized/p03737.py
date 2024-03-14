import sys

def main():
    for i in range(3):
        print(sys.stdin.read(1).upper(), end='')
    print("")

if __name__ == "__main__":
    main()