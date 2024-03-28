def main():
    N = int(input())
    
    heights = list(map(int, input().split()))
    
    signed = []
    prev = float('-inf')
    for i in range(N - 1):
        next_diff = heights[i + 1] - heights[i]
        next_sign = 0 if next_diff == 0 else next_diff // abs(next_diff)
        
        if i == 0:
            prev = next_sign
            continue
        
        if prev != next_sign:
            signed.append(prev)
            prev = next_sign
        
    if prev != float('-inf'):
        signed.append(prev)
    
    counts = [0, 0, 0, 0, 0]
    
    for i in range(1, len(signed) - 1):
        prev_sign = signed[i - 1]
        curr_sign = signed[i]
        next_sign = signed[i + 1]
        
        if curr_sign == 0:
            if prev_sign == 1 and next_sign == -1:
                counts[0] += 1
            elif prev_sign == -1 and next_sign == 1:
                counts[1] += 1
            else:
                counts[2] += 1
    
    for i in range(len(signed) - 1):
        curr_sign = signed[i]
        next_sign = signed[i + 1]
        
        if curr_sign != next_sign and curr_sign != 0 and next_sign != 0:
            if curr_sign > 0:
                counts[3] += 1
            else:
                counts[4] += 1
    
    for i in range(5):
        if i != 0:
            print(" ", end="")
        print(counts[i], end="")
    print()

if __name__ == "__main__":
    main()