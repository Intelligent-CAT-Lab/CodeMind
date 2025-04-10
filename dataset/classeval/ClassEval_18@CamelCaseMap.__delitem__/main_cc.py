
class CamelCaseMap: 
    def __init__(self):
        """
        Initialize data to an empty dictionary
        """
        self._data = {}

    def __delitem__(self, key):
        del self._data[self._convert_key(key)]
    def _convert_key(self, key):
        if isinstance(key, str):
            return self._to_camel_case(key)
        return key