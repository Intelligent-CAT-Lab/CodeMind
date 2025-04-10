def test(self):

        t = Thermostat(20, 25, 'heat')
        t.set_mode('cool')
        return t.get_mode()