This question was recently asked by AirBNB.

Given a sorted array, A, with possibly duplicated elements, find the indices of the first and last occurrences of a target element, x. Return -1 if the target is not found.

Example

    Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9
    Output: [6,8]

    Input: A = [100, 150, 150, 153], target = 150
    Output: [1,2]

    Input: A = [1,2,3,4,5,6,10], target = 9
    Output: [-1, -1]
Function signature

def get_range(arr, target)
# Fill this is
print get_range([1, 2, 2, 2, 2, 3, 4, 7, 8, 8], 2)
# [1, 4]
