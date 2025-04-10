def test(self):

        calendar = CalendarUtil()
        calendar.events = [{'date': datetime(2023, 1, 1, 0, 0), 'start_time': datetime(2023, 1, 1, 0, 0),
                            'end_time': datetime(2023, 1, 1, 1, 0), 'description': 'New Year'}]
        return calendar.is_available(datetime(2023, 1, 1, 0, 0), datetime(2023, 1, 1, 1, 0))