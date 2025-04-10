import itertools
class ArrangementCalculator: 
    def __init__(self, datas):
        """
        Initializes the ArrangementCalculator object with a list of datas.
        :param datas: List, the data elements to be used for arrangements.
        """
        self.datas = datas
    @staticmethod
    def factorial(n):
        result = 1
        for i in range(2, n + 1):
            result *= i
        return result