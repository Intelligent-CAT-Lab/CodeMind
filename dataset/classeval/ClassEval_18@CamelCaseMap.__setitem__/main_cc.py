
class CamelCaseMap: 
    def __init__(self):
        """
        Initialize data to an empty dictionary
        """
        self._data = {}

    def __setitem__(self, key, value):
        self._data[self._convert_key(key)] = value
    def _convert_key(self, key):
        if isinstance(key, str):
            return self._to_camel_case(key)
        return key