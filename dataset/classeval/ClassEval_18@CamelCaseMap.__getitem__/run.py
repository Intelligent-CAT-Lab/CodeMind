import os
import unittest
class CamelCaseMap:
    def __init__(self):
        self._data = {}

    def __getitem__(self, key):
        return self._data[self._convert_key(key)]

    def __setitem__(self, key, value):
        self._data[self._convert_key(key)] = value

    def __delitem__(self, key):
        del self._data[self._convert_key(key)]

    def __iter__(self):
        return iter(self._data)

    def __len__(self):
        return len(self._data)

    def _convert_key(self, key):
        if isinstance(key, str):
            return self._to_camel_case(key)
        return key

    @staticmethod
    def _to_camel_case(key):
        parts = key.split('_')
        return parts[0] + ''.join(part.title() for part in parts[1:])
class Test(unittest.TestCase):
    def test(self):
            camelize_map = CamelCaseMap()
            camelize_map['age'] = 30
            return camelize_map.__getitem__('age')
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_18@CamelCaseMap.__getitem__/output.txt', 'w') as wr:
    wr.write(str(a))
        