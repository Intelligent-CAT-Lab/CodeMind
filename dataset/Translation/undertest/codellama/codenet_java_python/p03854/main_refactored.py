class main:
    import re
    
    def is_dream_erased(s):
        # Replace all occurrences of "eraser" and "erase" with "-"
        s = re.sub("eraser", "-", s)
        s = re.sub("erase", "-", s)
        s = re.sub("dreamer", "-", s)
        s = re.sub("dream", "-", s)
        s = re.sub("-", "", s)
        return s == ""
    
    def main():
        # Read input from stdin
        s = input()
        # Check if the input is a valid string
        if not s.isalpha():
            print("NO")
            return
        # Check if the input is a dream that can be erased
        if is_dream_erased(s):
            print("YES")
        else:
            print("NO")
    
    if __name__ == "__main__":
        main()