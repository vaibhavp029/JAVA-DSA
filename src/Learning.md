# Learning 1

Arrays are not fast because they are arrays.
They are fast because their elements are stored contiguously, allowing direct address calculation.

--------------------------------------------------

# Learning 2

Big O does not measure seconds.
It measures how the amount of work grows as the input size grows.

--------------------------------------------------

# Learning 3

Accessing an array element is mathematics, not searching.

Address = Base Address + (Index × Size)

--------------------------------------------------

# Learning 4

Insertion and deletion in arrays are expensive because maintaining contiguous memory requires shifting elements.

-------------------------------------------------

# Learning 5

An array element's address is calculated using:

Address = Base Address + (Index × Size of Data Type)

The formula depends on the index, not on the total number of elements in the array.

------------------------------------------------

# Learning 6

An array index is not a position number.

It represents the offset from the base address.

Example:

arr[5]

means:

5 elements away from the base address.

----------------------------------------------

# Learning 7

Contiguous memory is not just a storage choice.

It allows direct mathematical address calculation using:

Address = Base Address + (Index × Size)

Without contiguous memory, direct indexing would not be possible.

---------------------------------------------

# Learning 8

The formula:

Address = Base Address + (Index × Size)

works only because array elements are stored contiguously.

--------------------------------------------------

# Learning 9

If arrays were stored randomly in memory, Java would need an additional mapping from index to address, increasing memory usage and complexity.

--------------------------------------------------

# Learning 10

The index is an offset from the base address, not a human-friendly position number.

--------------------------------------------------

# Learning 11

arr.length represents the number of elements in the array.

The last valid index is always:

arr.length - 1

--------------------------------------------------

# Learning 12

When using a for loop:

for(initialization; condition; update)

the update expression is automatically executed after every iteration.

Do not manually update the loop variable unless the algorithm specifically requires it.

---------------------------------------------------

# Learning 13

Boolean variables are useful for representing the success or failure of an operation.

Use meaningful names such as:
found
exists
isSorted

instead of generic names like:
flag
temp
x

----------------------------------------------------

# Learning 14

Choose variables that carry the most useful information.

Instead of returning only whether an element exists, returning its index provides both:
- Whether it exists.
- Where it exists.

Use -1 as a sentinel value because it is never a valid array index.

--------------------------------------------------------

# Learning 15

The best variable is not always the one that uses the least memory.

The best variable is the one that represents the required information.

Examples:

contains() → boolean

indexOf() → int (returns index or -1)

-----------------------------------------------------

# Learning 16

Write code for readability, not just correctness.

Good variable names and consistent formatting make code easier to understand and maintain.

Examples:

count > Occur

found > flag

Always prefer meaningful names.

---------------------------------------------------

# Learning 17

Code should not only be correct.

It should also be:

- Readable
- Meaningfully named
- Easy to maintain
- Easy to test

Good software engineering is writing code for humans first, computers second.

---------------------------------------------------

# Learning 18

A method should have one clear responsibility.

Instead of changing the behavior of an existing method for a new requirement, create a new method whose name clearly describes its purpose.

Examples:

contains()

countOccurrences()

printAllIndices()
