import argparse
if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='run translation with open-source models given dataset and languages')

    parser.add_argument('--use_test', help='use test dataset', action='store_true')
    parser.add_argument('--use_misleading_test', help='use test dataset', action='store_true')
    args = parser.parse_args()
    if args.use_test:
        print(1)
    if args.use_misleading_test:
        print(2)
