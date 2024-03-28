import sys

def main():
    sys.stdout = sys.stdout.buffer
    sys.stdout.flush()
    sys.stdout.write(str(int(input().strip().split()[0]) / int(input().strip().split()[1])) + " ")
    for i in range(int(input().strip().split()[1]) - int(input().strip().split()[0]) % int(input().strip().split()[1])):
        sys.stdout.write(str(int(input().strip().split()[0]) / int(input().strip().split()[1])) + " ")
    for i in range(int(input().strip().split()[1]) - int(input().strip().split()[0]) % int(input().strip().split()[1])):
        sys.stdout.write(str(int(input().strip().split()[0]) / int(input().strip().split()[1])) + " ")
    sys.stdout.flush()

if __name__ == "__main__":
    main()