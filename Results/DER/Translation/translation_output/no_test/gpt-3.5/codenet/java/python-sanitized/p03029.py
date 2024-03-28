import sys

def main():
    try:
        input_str = sys.stdin.readline().strip()
        A, P = map(int, input_str.split())
        print((P + 3*A) // 2)

    except Exception as e:
        print(f"Exception: {e}")

if __name__ == "__main__":
    main()