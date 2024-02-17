def run():
    """ return nCk """

    p = 10**9 + 7
    n, k = [int(i) for i in input().split()]
    if n > k:
        print(0)
        return
    
    table_1 = [1]
    temp = 1
    for nn in range(1, k+1):
        temp = temp * nn
        table_1.append(temp % p)
    # print(table_1)
    table_2 = [pow(t1, p-2, p) for t1 in table_1]
    # print(table_2)
    
    a = table_1[k]
    b = table_2[n]
    c = table_2[k-n] if k>=n else 0
    # print(n, k, a, b, c)
    # print(table_1[n] / (table_1[k] * table_1[n-k]))
    print(a%p * b%p * c%p)
    
if __name__ == "__main__":
    run()


