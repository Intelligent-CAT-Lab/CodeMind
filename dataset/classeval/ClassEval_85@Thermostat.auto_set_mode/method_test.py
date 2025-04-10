def test(self):

        t = Thermostat(25, 25, 'cool')
        t.auto_set_mode()
        return t.get_mode()