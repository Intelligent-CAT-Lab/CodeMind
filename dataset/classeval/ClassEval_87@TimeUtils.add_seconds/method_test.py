def test(self):

        timeutils = TimeUtils()
        return timeutils.add_seconds(300),(timeutils.datetime + datetime.timedelta(seconds=300)).strftime('%H:%M:%S')