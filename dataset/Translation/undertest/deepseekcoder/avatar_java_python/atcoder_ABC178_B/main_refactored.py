class main:
    def atcoder_ABC178_B(a, b, c, d):
        return max(max(max(a * c, b * d), a * d), b * c)
    
    # Test input
    a = 418379342
    b = 802780784
    c = -790013317
    d = -445130206
    
    print(atcoder_ABC178_B(a, b, c, d))