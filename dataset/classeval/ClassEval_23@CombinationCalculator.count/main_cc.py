import math
from typing import List
class CombinationCalculator: 
    def __init__(self, datas: List[str]):
        """
        Initialize the calculator with a list of data.
        """
        self.datas = datas
    def count(n: int, m: int) -> int:
        if m == 0 or n == m:
            return 1
        return math.factorial(n) // (math.factorial(n - m) * math.factorial(m))