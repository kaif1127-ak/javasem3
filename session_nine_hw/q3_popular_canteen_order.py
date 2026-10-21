
def mostPopular(orders):
    count = {}

    for item in orders:
        if item in count:
            count[item] += 1
        else:
            count[item] = 1

    popular_item = orders[0]
    highest_count = count[popular_item]

    for item in orders:
        if count[item] > highest_count:
            popular_item = item
            highest_count = count[item]

    return popular_item, highest_count


orders = ["Burger", "Pizza", "Burger", "Sandwich",
          "Pizza", "Burger", "Pizza"]

item, frequency = mostPopular(orders)

print("Most Popular Order:", item)
print("Order Count:", frequency)
