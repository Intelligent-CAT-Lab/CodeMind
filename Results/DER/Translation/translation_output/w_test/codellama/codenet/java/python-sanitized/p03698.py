import sys

def is_uncopyrightable(input_string):
    unique_chars = set(input_string)
    return "yes" if len(input_string) == len(unique_chars) else "no"

if __name__ == "__main__":
    input_string = sys.stdin.readline().strip()
    print(is_uncopyrightable(input_string))