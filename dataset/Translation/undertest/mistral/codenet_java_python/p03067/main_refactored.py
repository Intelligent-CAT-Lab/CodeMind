class main:
    import sys
    
    def solve(a, b, c):
        if (c >= a and c <= b) or (c >= b and c <= a):
            return "Yes"
        else:
            return "No"
    
    if __name__ == "__main__":
        a = int(input())
        b = int(input())
        c = int(input())
        print(solve(a, b, c))