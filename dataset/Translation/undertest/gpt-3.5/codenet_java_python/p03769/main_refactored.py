class main:
    def permutation_whose_number_of_increasing_sequence_is_k(K):
        cur = (K + 1).bit_length() - 1
        list_ = []
        for i in range(cur):
            list_.append(i)
    
        p = cur
        for d in range(cur - 1, -1, -1):
            x = 1 << d
            if (cur + x) <= K:
                cur += x
                list_.insert(d, p)
                p += 1
    
        return list_
    
    def solve():
        n = nl()
        perm = permutation_whose_number_of_increasing_sequence_is_k(n)
        out.write(str(len(perm) * 2) + '\n')
        for i in range(1, len(perm) + 1):
            if i > 1:
                out.write(" ")
            out.write(str(i))
        for i in range(len(perm)):
            out.write(" " + str(perm[i] + 1))
        out.write("\n")
    
    if __name__ == "__main__":
        S = time.time()
        solve()
        out.flush()
        G = time.time()
        print(G - S)
    
    # Sample input function, you can replace this with your input handling logic
    def input_integer():
        return int(input())
    
    # Sample output function, you can replace this with your desired output implementation
    def print_output(output):
        print(output)
    
    # Sample test case
    input_val = input_integer()
    output = solve(input_val)
    print_output(output)