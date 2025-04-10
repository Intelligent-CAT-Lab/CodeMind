
class CamelCaseMap: 
    def __init__(self):
        """
        Initialize data to an empty dictionary
        """
        self._data = {}

    def __getitem__(self, key):
        return self._data[self._convert_key(key)]
    def _convert_key(self, key):
        if isinstance(key, str):
            return self._to_camel_case(key)
        return key