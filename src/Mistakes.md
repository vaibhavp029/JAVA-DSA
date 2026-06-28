# Mistake 1
I thought execution time decides which algorithm is better.

Correction:
Execution time depends on hardware, compiler, programming language, etc.
Time Complexity measures how the number of operations grows as input size increases.

-----------------------------------------------------------------------------------

# Mistake 2
I answered O(100).

Correction:
Big O is written in terms of input size (n), not a fixed input.
Two consecutive loops are O(2n), which simplifies to O(n).

-----------------------------------------------------------------------------------
# Mistake 3

I assumed every nested loop is O(n²).

Correction:

A nested loop is O(n²) only when both loops depend on n.
If the inner loop runs a fixed number of times (like 5), the complexity is O(5n), which simplifies to O(n).

-----------------------------------------------------------------------------------
