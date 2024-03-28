def check_circle_inside_rectangle(W, H, x, y, r):
    # Judgement processing
    if (x - r) >= 0 and (x + r) <= W:
        if (y - r) >= 0 and (y + r) <= H:
            return "Yes"
    return "No"

# Input handling
try:
    work = input().split()
    W, H, x, y, r = map(int, work)
    
    # Output
    result = check_circle_inside_rectangle(W, H, x, y, r)
    print(result)
except Exception as e:
    print(e)