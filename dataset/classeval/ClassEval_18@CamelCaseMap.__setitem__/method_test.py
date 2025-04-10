def test(self):

        camelize_map = CamelCaseMap()
        camelize_map['first_name'] = 'John'
        camelize_map.__setitem__('first_Name', 'newname')
        return camelize_map['first_name']