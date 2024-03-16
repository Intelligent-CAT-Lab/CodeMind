import sys

def main():
    try:
        s = sys.stdin.readline().strip()
        print(s.replace(",", " "))
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()