class main:
    # Read the input from the user
    x = int(input())
    
    # Initial answer string
    ans = "ai1333"
    
    # Append '3' to the answer string for each increment of 100 in the input
    for i in range(x // 100):
        ans += "3"
    
    # Print the final answer
    print(ans)