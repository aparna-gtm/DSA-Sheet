⭐ Sorting Algorithms — Quick Revision Notes

1. Bubble Sort
Best case: O(n) when the array is already sorted (because of early stopping).
Average case: O(n²).
Worst case: O(n²).
Space complexity: O(1).
Good when the array is almost sorted and you want a very simple algorithm.
Not suitable for large inputs because it performs too many comparisons.

2. Selection Sort
Best case: O(n²).
Average case: O(n²).
Worst case: O(n²).
Space complexity: O(1).
Good when swapping cost is high, because selection sort performs at most n swaps.
Comparisons are always n², so it is slow for larger data sets.
Very predictable performance but not adaptive (no early stop).

3. Insertion Sort
Best case: O(n) when the array is nearly sorted.
Average case: O(n²).
Worst case: O(n²).
Space complexity: O(1).
Very good for small arrays and almost-sorted data.
Adaptive: becomes fast automatically if little work is needed.
Used in real-world sorting (e.g., inside TimSort and hybrid sorting algorithms).


Which one is best?
For almost sorted or small arrays → Insertion Sort is the best.
When swap operations are expensive → Selection Sort is best.
Bubble Sort is the simplest but generally the slowest due to many comparisons.