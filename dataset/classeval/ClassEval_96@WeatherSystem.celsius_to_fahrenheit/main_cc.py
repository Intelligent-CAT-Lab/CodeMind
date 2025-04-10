
class WeatherSystem: 
    def __init__(self, city) -> None:
        """
        Initialize the weather system with a city name.
        """
        self.temperature = None
        self.weather = None
        self.city = city
        self.weather_list = {}

    def celsius_to_fahrenheit(self):
        return (self.temperature * 9/5) + 32