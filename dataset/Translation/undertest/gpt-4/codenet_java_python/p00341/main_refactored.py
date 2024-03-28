class main:
    from collections import Counter
    
    # Read integers from input
    e = list(map(int, input().split()))
    
    # Check number of distinct elements
    if len(set(e)) > 3:
        print("no")
    else:
        # Count occurrences of each element
        counts = Counter(e).values()
        
        # Check if each element occurs 4, 8, or 12 times
        if all(count in {4, 8, 12} for count in counts):
            print("yes")
        else:
            print("no")