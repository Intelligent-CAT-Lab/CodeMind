class main:
    import sys
    
    try:
        input_string = list(sys.stdin.readline().strip())
        unique_chars = set(input_string)
    
        if len(input_string) == len(unique_chars):
            ans = "yes"
        else:
            ans = "no"
    
        print(ans)
    
    except Exception as e:
        print(e)
        sys.exit(0)