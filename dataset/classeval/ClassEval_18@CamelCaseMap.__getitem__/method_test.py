def test(self):

        camelize_map = CamelCaseMap()
        camelize_map['age'] = 30
        return camelize_map.__getitem__('age')