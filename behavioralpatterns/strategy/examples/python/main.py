from context import context;
from sprintworkoutmethod import sprintworkoutmethod;
from jogworkoutmethod import jogworkoutmethod


def main():
    y = context(sprintworkoutmethod())
    y.run()
    x= context(jogworkoutmethod())
    x.run()


if __name__ == "__main__":
    main()