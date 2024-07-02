def all_unique(test_list):
    if len(test_list) > len(set(test_list)):
        return False
    return True
all_unique([1,2,3])