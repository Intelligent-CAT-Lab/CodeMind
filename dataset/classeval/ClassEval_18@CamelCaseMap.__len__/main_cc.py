
class CamelCaseMap: 
    def __init__(self):
        """
        Initialize data to an empty dictionary
        """
        self._data = {}

    def __len__(self):
        return len(self._data)