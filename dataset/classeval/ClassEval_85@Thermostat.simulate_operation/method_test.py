def test(self):

        t = Thermostat(20, 25, 'heat')
        return t.simulate_operation(),t.get_mode(),t.current_temperature