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
# Mistake 1 - Big O measures execution time

What I Thought:
The algorithm that finishes in fewer seconds is always better.

Correction:
Execution time depends on hardware, compiler, operating system, programming language, etc.
Big O measures how the number of operations grows as the input size increases.

--------------------------------------------------

# Mistake 2 - Writing O(100)

What I Thought:
For two loops running 100 times each, the complexity is O(100).

Correction:
Big O is written in terms of the input size (n), not a specific input.
The operations are 2n, which simplifies to O(n).

--------------------------------------------------

# Mistake 3 - Every nested loop is O(n²)

What I Thought:
If there are nested loops, the complexity is always O(n²).

Correction:
A nested loop is O(n²) only when both loops depend on n.
If the inner loop runs a constant number of times (e.g., 5), then the complexity is O(5n), which simplifies to O(n).

--------------------------------------------------

# Mistake 4 - Keeping all terms in Big O

What I Thought:
Time complexity should remain O(n + n²).

Correction:
Big O keeps only the highest-order term because it dominates the growth as the input size becomes very large.
Therefore:
O(n + n²) = O(n²)

--------------------------------------------------

# Mistake 5 - Why arrays are stored contiguously

What I Thought:
Arrays are stored contiguously mainly to make searching faster.

Correction:
Contiguous memory allows the computer to calculate the address of any element directly using:
Address = Base Address + (Index × Size of Data Type)
This makes array access O(1).
Searching by value is still O(n).

--------------------------------------------------

# Mistake 6 - Insertion changes addresses

What I Thought:
When inserting into an array, the addresses of elements are changed.

Correction:
Memory addresses are fixed.
The values are moved (shifted) to new memory locations to maintain contiguous storage.

--------------------------------------------------

# Mistake 7 - Deletion is O(1)

What I Thought:
Deletion is O(1) because we can directly reach the index.

Correction:
Finding the element by index is O(1), but maintaining contiguous memory requires shifting all subsequent elements.
Therefore:
O(1) + O(n) = O(n)

--------------------------------------------------

# Mistake 8 - Confusing addresses with values

What I Thought:
During insertion and deletion, the addresses of array elements change.

Correction:
Memory addresses are fixed locations.
The values stored in those locations are shifted to maintain contiguous storage.

--------------------------------------------------

# Mistake 9 - Thinking of index as position

What I Thought:
arr[5] means the fifth position.

Correction:
The index represents the offset from the base address.
arr[5] is the sixth element but has an offset of 5 from the beginning.

--------------------------------------------------

# Mistake 10 - Why arrays are stored contiguously

What I Thought:
Contiguous memory mainly helps in searching.

Correction:
The primary purpose is direct address calculation.
Searching by value is still O(n).
Contiguous memory enables:
Address = Base Address + (Index × Size)
which makes indexing O(1).

---------------------------------------------------

# Mistake 11 - Using <= instead of <

What I Thought:
The loop should run while i <= arr.length.

Correction:
arr.length is the number of elements, not the last index.
The last valid index is arr.length - 1.
Using <= accesses arr[arr.length], causing ArrayIndexOutOfBoundsException.

---------------------------------------------------

# Mistake 12 - Incrementing loop variable manually inside a for loop

What I Thought:
I should write i++ inside the else block.

Correction:
A for loop already increments the loop variable after every iteration.
Incrementing it again causes elements to be skipped.

--------------------------------------------------

# Mistake 13 - Thinking smaller memory always means better design

What I Thought:
A boolean is always better than an int because it uses less memory.

Correction:
Choose the data type based on the problem's requirement.

- Use boolean when only existence (true/false) is needed.
- Use int when the position (index) is needed.

Correctness and fulfilling requirements come before micro-optimizing memory.

-------------------------------------------------

# Mistake 14 - Changing a method's responsibility

What I Thought:
I can modify indexOf() to print all indices and still keep the same method.

Correction:
A method should have one clear responsibility.

If the requirement changes significantly, create a new method instead of changing the meaning of an existing one.

Good API design is as important as correct logic.
