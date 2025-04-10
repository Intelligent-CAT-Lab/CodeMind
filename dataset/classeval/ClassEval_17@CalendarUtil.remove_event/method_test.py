def test(self):

        calendar = CalendarUtil()
        calendar.events = [{'date': datetime(2023, 1, 1, 0, 0), 'start_time': datetime(2023, 1, 1, 0, 0),
                            'end_time': datetime(2023, 1, 1, 22, 0), 'description': 'New Year'},
                           {'date': datetime(2023, 1, 2, 0, 0), 'start_time': datetime(2023, 1, 2, 0, 0),
                            'end_time': datetime(2023, 1, 2, 1, 0), 'description': 'New Year'}]
        calendar.remove_event({'date': datetime(2023, 1, 2, 0, 0), 'start_time': datetime(2023, 1, 2, 0, 0),
                               'end_time': datetime(2023, 1, 2, 1, 0), 'description': 'New Year'})
        return calendar.events