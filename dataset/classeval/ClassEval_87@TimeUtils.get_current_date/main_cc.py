import datetime
import time
class TimeUtils: 
    def __init__(self):
        """
        Get the current datetime
        """
        self.datetime = datetime.datetime.now()

    def get_current_date(self):
        format = "%Y-%m-%d"
        return self.datetime.strftime(format)