def findTopper(marks):
    topper_index = 0
    highest_total = 0

    for i in range(len(marks)):
        total = 0
        for mark in marks[i]:
            total += mark

        if i == 0 or total > highest_total:
            highest_total = total
            topper_index = i

    return topper_index, highest_total


marks = [
    [80, 90, 85],
    [95, 88, 92],
    [70, 75, 80]
]

index, total = findTopper(marks)

print("Topper Row:", index)
print("Total Marks:", total)