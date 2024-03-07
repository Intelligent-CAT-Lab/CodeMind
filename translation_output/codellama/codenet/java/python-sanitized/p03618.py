import sys

def main():
    input_string = sys.stdin.readline().strip()
    char_counts = {}
    for char in input_string:
        if char not in char_counts:
            char_counts[char] = 1
        else:
            char_counts[char] += 1
    total_count = len(input_string)
    unique_count = len(char_counts)
    print(total_count * (total_count + 1) // 2 - unique_count * (unique_count + 1) // 2)

if __name__ == "__main__":
    main()