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

list1 = [20,24,68,97,69,40]
def max_and_second_max(numbers):
        # Initialize max and second max with first two elements
    if len(numbers) < 2:
        return None, None
    # Build a binary tree (tournament)
    tree = [None] * (2 * len(numbers) - 1)
    for i in range(len(numbers)):
        tree[len(numbers) - 1 + i] = numbers[i]
    # Fill the tree from bottom up
    for i in range(len(numbers) - 2, -1, -1):
        tree[i] = max(tree[2 * i + 1], tree[2 * i + 2])
    # Find the maximum
    max_value = tree[0]
    # Find the second maximum
    second_max = None
    if tree[1] == max_value:
        second_max = tree[2]
    else:
        second_max = tree[1]
    # Traverse the tree to find the second maximum
    for i in range(1, len(numbers) - 1):
        if tree[i] == max_value:
            if tree[2 * i + 1] != max_value and (second_max is None or tree[2 * i + 1] > second_max):
                second_max = tree[2 * i + 1]
            if tree[2 * i + 2] != max_value and (second_max is None or tree[2 * i + 2] > second_max):
                second_max = tree[2 * i + 2]
    return max_value, second_max
print(max_and_second_max(list1))
compute= max_and_second_max
