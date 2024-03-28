class main:
    # Get the input string from the user
    s = input()
    
    # Check if the third and fourth characters are the same and if the fifth and sixth characters are the same
    if s[2] == s[3] and s[4] == s[5]:
        print("Yes")
    else:
        print("No")