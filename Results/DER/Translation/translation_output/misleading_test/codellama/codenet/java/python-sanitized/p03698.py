import sys

def main():
    input_string = sys.stdin.readline().strip()
    unique_chars = set(input_string)
    if len(input_string) == len(unique_chars):
        print("yes")
    else:
        print("no")

if __name__ == "__main__":
    main()



$ python3 test.py
uncopyrightable
y3s