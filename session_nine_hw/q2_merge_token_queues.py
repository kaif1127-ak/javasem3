
def mergeTokens(counterA, counterB):
    result = []
    i = 0
    j = 0

    while i < len(counterA) and j < len(counterB):
        if counterA[i] <= counterB[j]:
            result.append(counterA[i])
            i += 1
        else:
            result.append(counterB[j])
            j += 1

    while i < len(counterA):
        result.append(counterA[i])
        i += 1

    while j < len(counterB):
        result.append(counterB[j])
        j += 1

    return result


counterA = [1, 3, 5, 7]
counterB = [2, 3, 6, 8]

print("Merged Queue:", mergeTokens(counterA, counterB))
