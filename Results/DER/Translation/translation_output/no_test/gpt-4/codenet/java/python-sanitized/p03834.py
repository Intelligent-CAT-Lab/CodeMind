import sys

def main():
    try:
        line = sys.stdin.readline().rstrip()
        print(line.replace(",", " "))
    except Exception as e:
        print(f"An error occurred: {e}")

if __name__ == "__main__":
    main()