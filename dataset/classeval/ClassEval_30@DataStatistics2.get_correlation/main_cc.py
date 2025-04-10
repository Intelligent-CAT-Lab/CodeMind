import numpy as np
class DataStatistics2: 
    def __init__(self, data):
        """
        Initialize Data List
        :param data:list
        """
        self.data = np.array(data)

    def get_correlation(self):
        return np.corrcoef(self.data, rowvar=False)