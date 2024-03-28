class main:
    import re
    
    def solve(s):
        # Remove all occurrences of "()"
        s = re.sub(r"\(\)", "", s)
    
        # Find the index of the first "*"
        star_index = s.find("*")
    
        # Initialize the result to 0
        result = 0
    
        # Iterate over the characters in the string
        for i in range(star_index - 1, -1, -1):
            # If the character is a "("
            if s[i] == "(":
                # Find the index of the corresponding ")"
                right_index = s.find(")", i + 1)
    
                # If the ")" is found
                if right_index != -1:
                    # Increment the result
                    result += 1
    
        return result
    
    # Test the function with the given input
    s = "((*)())"
    print(solve(s))
    
    
    Next, it iterates over the characters in the string, starting from the index of the first "*" and moving backwards. For each character, it checks if it is a "(" and if so, it finds the index of the corresponding ")" using the `find()` method. If the ")" is found, it increments the result.