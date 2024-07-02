from typing import *
def greatest_common_divisor(a: int, b: int) -> int:
    while b:
        a, b = b, a % b
    return a

greatest_common_divisor(3, 7) 