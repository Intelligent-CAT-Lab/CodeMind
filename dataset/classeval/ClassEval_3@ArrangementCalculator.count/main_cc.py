import itertools
class ArrangementCalculator: 
    def __init__(self, datas):
        """
        Initializes the ArrangementCalculator object with a list of datas.
        :param datas: List, the data elements to be used for arrangements.
        """
        self.datas = datas
    def count(n, m=None):
        if m is None or n == m:
            return ArrangementCalculator.factorial(n)
        else:
            return ArrangementCalculator.factorial(n) // ArrangementCalculator.factorial(n - m)
    @staticmethod
    def factorial(n):
        result = 1
        for i in range(2, n + 1):
            result *= i
        return result