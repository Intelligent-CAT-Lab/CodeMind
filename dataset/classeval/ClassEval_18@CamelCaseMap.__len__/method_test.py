def test(self):

        camelize_map = CamelCaseMap()
        camelize_map['first_name'] = 'John'
        return camelize_map.__len__()