# No equivalent import necessary in Python for the required functionality

def main():
    # Reading string input from user
    A = input()

    # Getting the length of the input string
    N = len(A)
    
    # Initializing the count array for each alphabet letter
    cnt = [0] * 26
    
    # Counting occurrences of each letter in the string
    for ch in A:
        cnt[ord(ch) - ord('a')] += 1
    
    # Calculating the answer based on string length
    ans = (N * (N + 1) // 2) + 1
    
    # Adjusting the answer based on the frequency of each letter
    for i in range(26):
        if cnt[i] > 0:
            ans -= (cnt[i] * (cnt[i] + 1) // 2)
    
    # Printing the final result
    print(ans)

# Invoking the main function when the script is executed
if __name__ == "__main__":
    main()