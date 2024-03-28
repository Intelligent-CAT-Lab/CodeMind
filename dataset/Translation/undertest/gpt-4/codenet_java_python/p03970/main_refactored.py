class main:
    # Read input from user
    S = input()
    correct = "CODEFESTIVAL2016"
    num = 0
    
    # Compare each character
    for i in range(16):
        if S[i] != correct[i]:
            num += 1
    
    # Print the result
    print(num)