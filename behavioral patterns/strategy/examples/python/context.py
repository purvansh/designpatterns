class context:
    def __init__(self, runningmethod):
        self.strategy = runningmethod
        print('added workout method')

    def run(self):
        self.strategy.run()