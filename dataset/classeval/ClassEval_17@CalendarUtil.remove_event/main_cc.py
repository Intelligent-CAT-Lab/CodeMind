from datetime import datetime, timedelta
class CalendarUtil: 
    def __init__(self):
        """
        Initialize the calendar with an empty list of events.
        """
        self.events = []

    def remove_event(self, event):
        if event in self.events:
            self.events.remove(event)