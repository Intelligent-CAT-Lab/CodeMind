import numpy as np
class DataStatistics2: 
    def __init__(self, data):
        """
        Initialize Data List
        :param data:list
        """
        self.data = np.array(data)

    def get_variance(self):
        return round(np.var(self.data), 2)