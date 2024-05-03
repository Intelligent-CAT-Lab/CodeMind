def greatest_common_divisor(a: int, b: int) -> int:
    while b:	## b = CLRJ
        a, b = b, a % b	## a = CLRJ|b = CLRJ
    return a	## a = CLRJ
