class main:
    # Read the input
    h, w, a, b = map(int, input().split())
    
    # Prepare strings for the two types of lines
    s1 = "0" * a + "1" * (w - a)
    s2 = "1" * a + "0" * (w - a)
    
    # Generate the output matrix
    for i in range(h):
        if i < b:
            print(s1)
        else:
            print(s2)