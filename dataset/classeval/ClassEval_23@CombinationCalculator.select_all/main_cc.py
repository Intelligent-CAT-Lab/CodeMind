import math
from typing import List
class CombinationCalculator: 
    def __init__(self, datas: List[str]):
        """
        Initialize the calculator with a list of data.
        """
        self.datas = datas
    def select_all(self) -> List[List[str]]:
        result = []
        for i in range(1, len(self.datas) + 1):
            result.extend(self.select(i))
        return result
    def select(self, m: int) -> List[List[str]]:
        result = []
        self._select(0, [None] * m, 0, result)
        return result