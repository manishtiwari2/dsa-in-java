# Problem: Satisfiability of Equality Equations

## Problem Statement
Given an array of equations like "a==b" and "a!=b",
determine if all equations can be satisfied.

---

## Input
- equations: array of strings

## Output
- true → if all equations are valid
- false → if contradiction exists

---

## Approach
We use Disjoint Set Union (DSU):

1. Process all "==" equations → connect variables
2. Process all "!=" equations → check contradiction
3. If two unequal variables belong to same set → return false

---

## Complexity
- Time: O(n α(n)) ≈ O(n)
- Space: O(1)

---

## Example

Input:
["a==b", "b==c", "a!=c"]

Output:
false

---

## Key Learning
- DSU helps in constraint satisfaction problems
- Two-pass processing is critical
