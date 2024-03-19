import sys

def replace_commas(s):
    return s.replace(",", " ")

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(replace_commas(s))