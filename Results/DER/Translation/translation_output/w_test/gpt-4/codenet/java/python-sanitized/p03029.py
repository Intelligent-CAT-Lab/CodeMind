def p03029(A, P):
    return (P + 3 * A) // 2

if __name__ == "__main__":
    # Reading input from user
    str_input = input().split()
    A = int(str_input[0])
    P = int(str_input[1])
    
    # Computing and printing the result
    print(p03029(A, P))