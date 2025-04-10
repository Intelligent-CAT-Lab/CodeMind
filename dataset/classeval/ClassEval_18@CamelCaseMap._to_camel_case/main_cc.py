
class CamelCaseMap: 
    def __init__(self):
        """
        Initialize data to an empty dictionary
        """
        self._data = {}

    @staticmethod
    def _to_camel_case(key):
        parts = key.split('_')
        return parts[0] + ''.join(part.title() for part in parts[1:])