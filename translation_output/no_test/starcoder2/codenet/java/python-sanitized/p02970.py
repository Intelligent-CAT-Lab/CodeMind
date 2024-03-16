from decimal import *

N, D = map(int, input().split())

ans = Decimal(N / (D * 2 + 1))
ans = ans.quantize(Decimal('0'), rounding=ROUND_CEILING)
print(ans)

/2019-09-25/README.md
# 2019-09-25