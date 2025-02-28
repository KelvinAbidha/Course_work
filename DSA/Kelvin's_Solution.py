def build_tournament(tourn, n):
    """ Function to build the tournament tree """
    for i in range(2 * n - 2, 1, -2):  # Iterate from last internal node to root
        tourn[i // 2] = max(tourn[i], tourn[i + 1])

def get_next_max(tourn, n):
    """ Function to get the second maximum from the tournament """
    i = 1  # Start at root
    next_max = min(tourn[2], tourn[3])  # Compare the first two children

    while i < n:
        if tourn[i * 2] == tourn[1]:  # If left child is max
            next_max = max(next_max, tourn[i * 2 + 1])  # Compare with right child
            i = i * 2  # Move left
        else:  # If right child is max
            next_max = max(next_max, tourn[i * 2])  # Compare with left child
            i = i * 2 + 1  # Move right
    
    return next_max

def main():
    n = int(input("Enter the number of elements [n]: "))
    tourn = [0] * (2 * n)  # Initialize tournament tree
    
    print("Enter the elements:")
    for i in range(n, 2 * n):
        tourn[i] = int(input())  # Store values in second half
    
    # Build the tournament tree
    build_tournament(tourn, n)

    # Print results
    print("The Maximum is:", tourn[1])
    print("The Second Maximum is:", get_next_max(tourn, n))

if __name__ == "__main__":
    main()
