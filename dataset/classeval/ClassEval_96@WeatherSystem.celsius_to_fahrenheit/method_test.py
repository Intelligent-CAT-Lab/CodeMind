def test(self):

        weatherSystem = WeatherSystem('New York')
        weatherSystem.temperature = 23
        return weatherSystem.celsius_to_fahrenheit()