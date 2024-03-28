class main:
    def solve():
        ai, ao, at, aj, al, as_, az = map(int, input().split())
        ans = 0
        ans += ao
        parity_sum = ai % 2 + aj % 2 + al % 2
        if parity_sum == 3:
            ans += ai + aj + al
        elif parity_sum == 2:
            if ai != 0 and aj != 0 and al != 0:
                ans += ai + aj + al - 1
            else:
                ans += ai + aj + al - 2
        elif parity_sum == 1:
            ans += ai + aj + al - 1
        else:
            ans += ai + aj + al
        print(ans)
    
    solve()