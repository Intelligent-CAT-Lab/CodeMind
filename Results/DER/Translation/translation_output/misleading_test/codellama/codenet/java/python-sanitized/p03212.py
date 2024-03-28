import sys

def main():
    N = int(sys.stdin.readline().strip())
    queue = ["357", "375", "537", "573", "735", "753"]
    count = 0
    for s in queue:
        if int(s) <= N:
            count += 1
    print(count)

if __name__ == "__main__":
    main()