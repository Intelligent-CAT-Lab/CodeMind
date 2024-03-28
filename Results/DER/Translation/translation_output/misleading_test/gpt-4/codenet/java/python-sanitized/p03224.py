def print_no_solution():
    print("No")
    return

def print_solution(l, answer):
    print("Yes")
    print(l+1)
    for i in range(l+1):
        string = [str(l)]
        for j in range(i):
            string.append(str(answer[j][i-1]))
        for j in range(i, l):
            answer[i][j] = Index[0]
            string.append(str(Index[0]))
            Index[0] += 1  # Using Index as a mutable int via list
        print(" ".join(string))

def p03224():
    N = int(input())
    l = 1
    while l < N:
        N -= l
        l += 1
    if N != l:
        print_no_solution()
        return
    
    answer = [[0] * l for _ in range(l+1)]
    Index = [1]  # Using list to have a mutable int to behave like nonlocal
    print_solution(l, answer)

# Read the input test case and execute
p03224()