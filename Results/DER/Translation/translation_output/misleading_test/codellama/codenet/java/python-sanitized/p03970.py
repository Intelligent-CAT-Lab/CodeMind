import sys

def main():
    input_string = sys.stdin.readline().strip()
    correct_string = "CODEFESTIVAL2016"
    num_errors = 0
    for i in range(len(input_string)):
        if input_string[i] != correct_string[i]:
            num_errors += 1
    print(num_errors)

if __name__ == "__main__":
    main()