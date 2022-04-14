number = int(input())

numberList = list(map(int, input().split()))

numberList.sort()

print(numberList[0], numberList[number - 1])
