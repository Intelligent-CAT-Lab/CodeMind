import sys

def weather_forecast(weather):
    if weather == "Sunny":
        return "Cloudy"
    elif weather == "Cloudy":
        return "Rainy"
    elif weather == "Rainy":
        return "Sunny"
    else:
        return "Invalid input"

if __name__ == "__main__":
    weather = sys.stdin.readline().strip()
    print(weather_forecast(weather))