class main:
    from decimal import Decimal, getcontext
    
    # Set the precision for Decimal operations
    getcontext().prec = 50
    
    # Input parsing, assuming the input is given in the standard format "1000 100 100"
    N, d, x = map(float, input().split())
    
    # Convert inputs to Decimal for higher precision arithmetic operations
    N = Decimal(N)
    d = Decimal(d)
    x = Decimal(x)
    
    ans = Decimal("0.0")
    
    while N > Decimal("0.5"):
        adnum = (d + x * (N - Decimal("0.5")))
        ans += adnum
        d = (N + Decimal("