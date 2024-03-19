def weather_forecast(weather):
    if weather == "Sunny":
        return "Cloudy"
    elif weather == "Cloudy":
        return "Rainy"
    elif weather == "Rainy":
        return "Sunny"

# Test input
print(weather_forecast("Sunny"))  # Expected output: "Cloudy"