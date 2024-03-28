class main:
    import decimal
    
    def main():
        N, d, x = map(decimal.Decimal, input().split())
    
        ans = decimal.Decimal(0.0)
    
        while N > decimal.Decimal(0.5):
            adnum = d + x * (N - decimal.Decimal(0.5))
            ans += adnum
            d = (N + decimal.Decimal(