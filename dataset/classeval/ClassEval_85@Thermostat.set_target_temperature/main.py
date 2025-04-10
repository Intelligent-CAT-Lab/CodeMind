import unittest
import time

class Thermostat:
    def __init__(self, current_temperature, target_temperature, mode):
        self.current_temperature = current_temperature
        self.target_temperature = target_temperature
        self.mode = mode

    def get_target_temperature(self):
        return self.target_temperature

    def set_target_temperature(self, temperature):
        self.target_temperature = temperature

    def get_mode(self):
        return self.mode

    def set_mode(self, mode):
        if mode in ['heat', 'cool']:
            self.mode = mode
        else:
            return False

    def auto_set_mode(self):
        if self.current_temperature < self.target_temperature:
            self.mode = 'heat'
        else:
            self.mode = 'cool'

    def auto_check_conflict(self):
        if self.current_temperature > self.target_temperature:
            if self.mode == 'cool':
                return True
            else:
                self.auto_set_mode()
                return False
        else:
            if self.mode == 'heat':
                return True
            else:
                self.auto_set_mode()
                return False

    def simulate_operation(self):
        self.auto_set_mode()
        use_time = 0
        if self.mode == 'heat':
            while(self.current_temperature < self.target_temperature):
                self.current_temperature += 1
                use_time += 1
        else:
            while(self.current_temperature > self.target_temperature):
                self.current_temperature -= 1
                use_time += 1
        return use_time
class Test(unittest.TestCase):
    def test(self):
            t = Thermostat(25, 25, 'cool')
            t.set_target_temperature(10)
            return t.get_target_temperature()