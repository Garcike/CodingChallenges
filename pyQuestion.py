def perimeter(l, num):

    value = (num * (l == 's') * 4) + (num * (l == 'c') * (6.28))

    print("{:.2f}".format(value))


# end perimeter

if __name__ == '__main__':
    perimeter('s', 7)
    perimeter('c', 4)
    perimeter('c', 9)