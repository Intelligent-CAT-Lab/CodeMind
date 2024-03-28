class main:
    # Sample test case
    n = int(input())
    a = list(map(int, input().split()))
    
    # Expected output
    print("Hom" if sum(1 for x in a if x % 2 == 1) >= 2 else "Tem")