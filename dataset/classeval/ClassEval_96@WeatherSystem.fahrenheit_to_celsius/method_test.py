def test(self):

        weatherSystem = WeatherSystem('New York')
        weatherSystem.temperature = 73
        return weatherSystem.fahrenheit_to_celsius()