class main:
    class p03840:
        def solve(self, ai, ao, at, aj, al, as, az):
            ans = 0
            ans += ao
            if (ai % 2 + aj % 2 + al % 2) == 3:
                ans += ai + aj + al
            elif (ai % 2 + aj % 2 + al % 2) == 2:
                if ai != 0 and aj != 0 and al != 0:
                    ans += ai + aj + al - 1
                else:
                    ans += ai + aj + al - 2
            elif (ai % 2 + aj % 2 + al % 2) == 1:
                ans += ai + aj + al - 1
            else:
                ans += ai + aj + al
            return ans
    
    if __name__ == "__main__":
        ai, ao, at, aj, al, as, az = map(int, input().split())
        print(p03840().solve(ai, ao, at, aj, al, as, az))