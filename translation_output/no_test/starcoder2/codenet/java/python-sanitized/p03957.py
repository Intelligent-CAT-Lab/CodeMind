class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        c = 0
        for i in range(len(s)):
            if s[i] in 'aeiouAEIOU':
                if i < len(s) // 2:
                    c += 1
                else:
                    c -= 1
        return c == 0


  }
}