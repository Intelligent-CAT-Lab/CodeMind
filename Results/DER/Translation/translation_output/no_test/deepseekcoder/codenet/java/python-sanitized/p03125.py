import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())

    print(b % a == 0 and a + b or b - a)

if __name__ == "__main__":
    main()



#