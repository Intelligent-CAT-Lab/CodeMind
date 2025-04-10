import time
class Thermostat: 
    def __init__(self, current_temperature, target_temperature, mode):
        """
        initialize instances of the Thermostat class, including the current temperature, target temperature, and operating mode.
        :param current_temperature: float
        :param target_temperature: float
        :param mode: str, the work mode
        """
        self.current_temperature = current_temperature
        self.target_temperature = target_temperature
        self.mode = mode

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