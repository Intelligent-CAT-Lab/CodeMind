def test(self):

        timeutils = TimeUtils()
        return timeutils.get_current_time(),timeutils.datetime.strftime('%H:%M:%S')