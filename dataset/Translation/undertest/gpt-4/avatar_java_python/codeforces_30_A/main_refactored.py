class main:
    from sympy import symbols, Eq, solve
    from sympy.core.power import integer_nthroot
    
    A, B, N = map(int, input().split())
    
    x = symbols('x')
    eq = Eq(A * x**N, B)
    
    # Solving for x, given that x must be an integer
    sol = solve(eq, x)
    found = False
    
    for s in sol:
        if s.is_integer and -1000 <= s <= 1000:  #