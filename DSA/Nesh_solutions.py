Question 1///

list1 = [20,24,68,97,69,40]
def max_and_second_max(numbers):
    # Initialize max and second max with first two elements
    if numbers[0] > numbers[1]:
        max_value = numbers[0]
        second_max = numbers[1]
    else:
        max_value = numbers[1]
        second_max = numbers[0]
    # Iterate through the remaining elements
    for i in range(2, len(numbers)):
        if numbers[i] > max_value:
            second_max = max_value
            max_value = numbers[i]
        elif numbers[i] > second_max and numbers[i] != max_value:
            second_max = numbers[i]
    return max_value, second_max
print(max_and_second_max(list1))
compute= max_and_second_max

Question 2///

