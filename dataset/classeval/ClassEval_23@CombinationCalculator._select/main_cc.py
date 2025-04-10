import math
from typing import List
class CombinationCalculator: 
    def __init__(self, datas: List[str]):
        """
        Initialize the calculator with a list of data.
        """
        self.datas = datas
    def _select(self, dataIndex: int, resultList: List[str], resultIndex: int, result: List[List[str]]):
        resultLen = len(resultList)
        resultCount = resultIndex + 1
        if resultCount > resultLen:
            result.append(resultList.copy())
            return

        for i in range(dataIndex, len(self.datas) + resultCount - resultLen):
            resultList[resultIndex] = self.datas[i]
            self._select(i + 1, resultList, resultIndex + 1, result)
    def select(self, m: int) -> List[List[str]]:
        result = []
        self._select(0, [None] * m, 0, result)
        return result