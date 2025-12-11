Merge Sort-
Merge Sort is a divide-and-conquer, comparison-based sorting algorithm. It divides the array into two halves, recursively sorts them, and merges them.

Key Points:
Always divides the array into two equal halves.
Merging two sorted halves takes linear time.
Guarantees consistent performance in all cases.
Uses additional memory due to temporary arrays.

Time Complexity:
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n log n)

Space Complexity:
O(n) extra space (for merge operation)
Not an in-place algorithm

Stability:
Merge Sort is stable (it keeps the order of equal elements).

When to Use Merge Sort:
When stability is important.
When sorting linked lists (merge can be done in O(1) extra space).
When dealing with large datasets that do not fit in memory (external sorting).

Summary:
Merge Sort provides predictable and guaranteed O(n log n) behavior at the cost of extra memory usage.

Quick Sort – 
Quick Sort is a divide-and-conquer sorting algorithm that partitions the array around a pivot element. Elements smaller than pivot go to the left; larger go to the right.

Key Points:
Works in-place with minimal extra space.
Very fast in practice due to good cache locality.
Performance depends heavily on pivot selection.
Not stable.

Time Complexity:
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n²)

Space Complexity:

O(log n) on average (recursive call stack)
O(n) in the worst case (when partitioning becomes highly unbalanced)

Stability:
Quick Sort is not stable.

Why Worst Case O(n²) Happens:
Worst case occurs when the pivot chosen is always the smallest or largest element.
This makes the partition extremely unbalanced, dividing the array into sizes:
n-1 and 0
instead of n/2 and n/2.

Example of Worst Case:
Array: [1, 2, 3, 4, 5, 6, 7] (already sorted)
Pivot strategy: choosing the first element as pivot

Dry Run (Worst Case):
pivot = 1 → Left = empty, Right = n-1 elements
pivot = 2 → Left = empty, Right = n-2 elements
pivot = 3 → Left = empty, Right = n-3 elements
... and so on

This produces:
n + (n-1) + (n-2) + ... + 1 operations
= O(n²)

Why does it happen?
Because Quick Sort depends on creating two nearly equal partitions.
When pivot selection is poor, the algorithm degrades into repeated linear scans with linear recursion depth.

Preventing Worst Case:
Use random pivot selection.
Use median-of-three pivot selection.
Switch to Insertion Sort for small subarrays.

Summary:
Quick Sort is usually faster in practice than Merge Sort, but it suffers from worst-case O(n²) time when the pivot selection is poor. It is memory-efficient and cache-friendly.

Quick Sort vs Merge Sort – Summary Notes
Quick Sort:
Faster in practice.
In-place, O(log n) space.
Not stable.
Worst-case degradation to O(n²) if pivot selection is poor.

Merge Sort:
Always O(n log n).
Uses extra O(n) space.
Stable.
Preferred when stability is required or when working with linked lists or external sorting.