class main:
    A, B, C, D, E, F = map(int, input().split())
    
    ans1 = A * 100
    ans2 = 0
    
    for a in range(F // (A * 100) + 1):
        for b in range(F // (B * 100) + 1):
            for c in range(F // C + 1):
                for d in range(F // D + 1):
                    total_water = 100 * a * A + 100 * b * B
                    total_sugar = C * c + D * d
                    if total_water + total_sugar <= F and (A * a + B * b) > 0:
                        if total_sugar <= E * (total_water // 100) and total_sugar * ans1 > ans2 * (total_water + total_sugar):
                            ans1 = total_water + total_sugar
                            ans2 = total_sugar
    
    print(ans1, ans2)