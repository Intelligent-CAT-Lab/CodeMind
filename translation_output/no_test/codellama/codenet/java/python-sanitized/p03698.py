import sys

def main():
    input_string = sys.stdin.readline().strip()
    input_list = input_string.split()
    unique_list = set(input_list)
    if len(input_list) == len(unique_list):
        print("yes")
    else:
        print("no")

if __name__ == "__main__":
    main()