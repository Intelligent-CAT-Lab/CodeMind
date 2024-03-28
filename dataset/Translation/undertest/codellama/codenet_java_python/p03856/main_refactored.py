class main:
    import sys
    
    def main():
        # Read input from stdin
        input_str = sys.stdin.readline().strip()
    
        # Initialize variables
        good = ["dream", "dreamer", "erase", "eraser"]
        poss = [True] * (len(input_str) + 1)
    
        # Loop through each character in the input string
        for i in range(len(input_str)):
            # If the current character is not a match, continue to the next character
            if not poss[i]:
                continue
    
            # Loop through each word in the "good" list
            for out in good:
                # If the current character is not a match, continue to the next character
                if i + len(out) > len(input_str):
                    continue
    
                # Count the number of matching characters
                match = 0
                for a in range(len(out)):
                    if out[a] == input_str[i + a]:
                        match += 1
    
                # If all characters match, set the next character to True
                if match == len(out):
                    poss[i + match] = True
    
        # Print the result
        print("YES" if poss[len(input_str)] else "NO")
    
    if __name__ == "__main__":
        main()