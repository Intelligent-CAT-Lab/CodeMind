import numpy as np
class DataStatistics2: 
    def __init__(self, data):
        """
        Initialize Data List
        :param data:list
        """
        self.data = np.array(data)

    def get_std_deviation(self):
        return round(np.std(self.data), 2)