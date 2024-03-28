from collections import defaultdict
import sys

def main():
    # Using defaultdict to initialize counts to zero
    res = defaultdict(int)

    # Read lines until EOF
    for line in sys.stdin:
        # Process each character in the line
        for c in line.strip():
            # Check for alphabetical characters and update the counter
            if c.isalpha():
                res[c.lower()] += 1

    # Print the results
    for i in range(26):
        print(f"{chr(97 + i)} : {res[chr(97 + i)]}")

if __name__ == "__main__":
    main()