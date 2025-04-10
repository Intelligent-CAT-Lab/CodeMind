import logging
import datetime
class AccessGatewayFilter: 
    def __init__(self):
        pass

    def set_current_user_info_and_log(self, user):
        host = user['address']
        logging.log(msg=user['name'] + host + str(datetime.datetime.now()), level=1)