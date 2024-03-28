import sys

def main():
    try:
        sc = input()
        print("Brown" if abs(int(sc) - int(sc)) <= 1 else "Alice")
    except Exception as e:
        e.printStackTrace()

if __name__ == "__main__":
    main()