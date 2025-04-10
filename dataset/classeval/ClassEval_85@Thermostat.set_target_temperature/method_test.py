def test(self):

        t = Thermostat(25, 25, 'cool')
        t.set_target_temperature(10)
        return t.get_target_temperature()