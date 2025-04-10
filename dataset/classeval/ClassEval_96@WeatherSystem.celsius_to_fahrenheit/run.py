import os
import unittest
class WeatherSystem:
    def __init__(self, city) -> None:
        self.temperature = None
        self.weather = None
        self.city = city
        self.weather_list = {}
    
    def query(self, weather_list, tmp_units = 'celsius'):
        self.weather_list = weather_list
        if self.city not in weather_list:
            return False
        else:
            self.temperature = self.weather_list[self.city]['temperature']
            self.weather = self.weather_list[self.city]['weather']
        if self.weather_list[self.city]['temperature units'] != tmp_units:
            if tmp_units == 'celsius':
                return self.fahrenheit_to_celsius(), self.weather
            elif tmp_units == 'fahrenheit':
                return self.celsius_to_fahrenheit(), self.weather
        else:
            return self.temperature, self.weather
    
    def set_city(self, city):
        self.city = city

    def celsius_to_fahrenheit(self):
        return (self.temperature * 9/5) + 32

    def fahrenheit_to_celsius(self):
        return (self.temperature - 32) * 5/9
class Test(unittest.TestCase):
    def test(self):
            weatherSystem = WeatherSystem('New York')
            weatherSystem.temperature = 23
            return weatherSystem.celsius_to_fahrenheit()
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_96@WeatherSystem.celsius_to_fahrenheit/output.txt', 'w') as wr:
    wr.write(str(a))
        