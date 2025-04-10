def test(self):

        t = Thermostat(25, 25, 'cool')
        return t.auto_check_conflict(),t.mode