
def findSlot(prices, newPrice):
    left = 0
    right = len(prices)

    while left < right:
        mid = (left + right) // 2

        if prices[mid] < newPrice:
            left = mid + 1
        else:
            right = mid

    return left


prices = [100, 200, 300, 400, 500]

newPrice = 350

position = findSlot(prices, newPrice)

print("Ticket Prices:", prices)
print("New Ticket Price:", newPrice)
print("Slot Index:", position)
