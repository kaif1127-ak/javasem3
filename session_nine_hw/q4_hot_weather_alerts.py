
def countAlerts(readings, k, threshold):
    if k <= 0 or k > len(readings):
        return 0

    window_sum = sum(readings[:k])
    alerts = 0

    if window_sum >= k * threshold:
        alerts += 1

    for i in range(k, len(readings)):
        window_sum = window_sum - readings[i - k] + readings[i]

        if window_sum >= k * threshold:
            alerts += 1

    return alerts


readings = [30, 32, 35, 31, 29, 36, 38]
k = 3
threshold = 33

print("Number of Alerts:", countAlerts(readings, k, threshold))
