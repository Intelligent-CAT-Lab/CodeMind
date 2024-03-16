# Get input from the user
S = input()

# Check if the first character is 'A'
if S[0] != 'A':
    print("WA")
else:
    # Count occurrences of 'C' within the specified range
    count = sum(1 for i in range(2, len(S) - 1) if S[i] == 'C')
    index = S.find('C', 2, len(S) - 1)

    # Ensure there is exactly one 'C' and it is within the range
    if count != 1:
        print("WA")
    else:
        # Check if other characters are lowercase, besides the first 'A' and the 'C' at the index
        if all(S[i].islower() or i == index for i in range(1, len(S))):
            print("AC")
        else:
            print("WA")