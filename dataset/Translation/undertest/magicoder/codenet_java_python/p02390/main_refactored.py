class main:
    # Python code
    
    def convert_seconds(S):
        h = S // 3600
        hi = S % 3600
        m = hi // 60
        s = S % 60
        return f"{h}:{m}:{s}"
    
    # Test input
    S = 46979
    
    # Call the function and print the result
    print(convert_seconds(S))