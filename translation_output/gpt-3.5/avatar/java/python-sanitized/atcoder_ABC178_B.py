def atcoder_ABC178_B():
    a, b, c, d = map(int, input().split())
    
    print(max(a * c, b * d, a * d, b * c))

atcoder_ABC178_B()