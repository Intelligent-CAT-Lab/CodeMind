import itertools
class ArrangementCalculator: 
    def __init__(self, datas):
        """
        Initializes the ArrangementCalculator object with a list of datas.
        :param datas: List, the data elements to be used for arrangements.
        """
        self.datas = datas
    def select_all(self):
        result = []
        for i in range(1, len(self.datas) + 1):
            result.extend(self.select(i))
        return result
    def select(self, m=None):
        if m is None:
            m = len(self.datas)
        result = []
        for permutation in itertools.permutations(self.datas, m):
            result.append(list(permutation))
        return result