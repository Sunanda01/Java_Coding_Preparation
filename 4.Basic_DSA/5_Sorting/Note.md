# Sorting Algorithms 

## Stable vs Unstable Sorts

**Stable Sorts:** Bubble, Insertion, Merge

**Unstable Sorts:** Selection, Quick, Heap

> **Stable Means:** If two elements are equal, their original order is preserved.
> Example: If you sort by marks, and two students have same marks, stable sort will keep them in name order.

---

## 1. Bubble Sort

- **Type:** Comparison, Stable Algorithm
- **Time Complexity:** Best $O(n)$, Average $O(n^2)$, Worst $O(n^2)$
- **Auxiliary Space:** $O(1)$
- **Trick to Remember:** Neighbour Fight - Big bubbles go up

### Dive In
- **Compare:** Compare only neighbours - `arr[j]` vs `arr[j+1]`
- **Swap:** If left is bigger, swap them
- **Pass:** After 1st pass, largest element reaches the end. After 2nd pass, 2nd largest, and so on.

### Why is it Stable?
It only swaps when `left > right`, never when `left == right`. So equal elements never cross each other.

### Why Use It?
- Very simple to understand and implement
- Best for almost sorted data, it becomes $O(n)$ with optimized flag
- In-place, needs no extra space

### Disadvantage
- Very slow for large data - $O(n^2)$

---

## 2. Selection Sort

- **Type:** Comparison, Unstable Algorithm
- **Time Complexity:** Best $O(n^2)$, Average $O(n^2)$, Worst $O(n^2)$
- **Auxiliary Space:** $O(1)$
- **Trick to Remember:** Select the Best - Find min, put it in front

### Dive In
- **Find:** In every pass, find the minimum in the unsorted part
- **Swap:** Swap that minimum with the first element of unsorted part
- **Pass:** After 1st pass, smallest is at index 0. After 2nd pass, 2nd smallest at index 1.

### Why is it Unstable?
It does a long-distance swap. Example: `[2a, 2b, 1]` - `1` will swap with `2a`, so `2b` comes before `2a` now. Order of equal elements changes.

### Why Use It?
- Minimum number of swaps - Only 1 swap per pass, total $O(n)$ swaps
- Good when swapping is expensive
- Simple, in-place

### Disadvantage
- Always $O(n^2)$ even if array is already sorted

---

## 3. Insertion Sort

- **Type:** Comparison, Stable Algorithm
- **Time Complexity:** Best $O(n)$, Average $O(n^2)$, Worst $O(n^2)$
- **Auxiliary Space:** $O(1)$
- **Trick to Remember:** Playing Cards - Pick one, shift bigger, insert

### Dive In
- **Pick:** Left side is always sorted. Pick next element as `key`
- **Shift:** Shift all bigger elements in sorted part one step to the right
- **Insert:** Insert `key` in its correct place

### Why is it Stable?
It only shifts when `arr[j] > key`, never when equal. So equal elements keep their order.

### Why Use It?
- Best for small arrays and almost sorted data
- Very fast in Best Case - $O(n)$
- In-place, stable, simple
- Used in practice inside QuickSort / MergeSort for small subarrays

### Disadvantage
- Slow for large, reverse-sorted data - $O(n^2)$

---

## 4. Merge Sort

- **Type:** Divide and Conquer Algorithm (Divide, Conquer and Merge)
- **Stable Algorithm**
- **Time Complexity:** $\Theta(n \log n)$ - Best, Average, Worst all same
- **Auxiliary Space:** $O(n)$
- **Well suited for Linked Lists. Works in $O(1)$ Aux Space.**
- **Used in External Sorting.**
- **In general for arrays, QuickSort outperforms it.**

### Dive In
- **Divide:** Split the array into two halves, again and again until you get single elements.
- **Conquer:** Single elements are already sorted, so no work needed.
- **Merge:** Merge the two sorted halves back together in sorted order. This is where the actual sorting happens.

### Why is it Stable?
Merge Sort never swaps equal elements, it picks the left one first while merging. That's why it's used when order matters, like sorting by name, then by marks.

### Why $O(n)$ Space?
In every `merge()` you create two temp arrays `left` and `right`. Max extra space at any time is $O(n)$.

### Why Good for Linked Lists?
For arrays, you need an extra array to merge. For linked lists, you just change `next` pointers, no extra array needed. So it becomes $O(1)$ Aux Space.

### Why Used in External Sorting?
When data is too big for RAM and stored on disk, you can sort small chunks in memory, write them to disk, and then merge them. Merge Sort is made for this.

### Why Does QuickSort Outperform It for Arrays?
QuickSort is in-place, uses $O(\log n)$ space, has better cache locality, and has smaller constant factors. So in practice, for normal arrays in memory, QuickSort is faster even though both are $n \log n$.

---

## Quick Comparison Table

| Sort | Stable? | Best | Average | Worst | Space | Trick |
| --- | --- | --- | --- | --- | --- | --- |
| Bubble | Yes | $O(n)$ | $O(n^2)$ | $O(n^2)$ | $O(1)$ | Big goes last |
| Selection | No | $O(n^2)$ | $O(n^2)$ | $O(n^2)$ | $O(1)$ | Smallest comes first |
| Insertion | Yes | $O(n)$ | $O(n^2)$ | $O(n^2)$ | $O(1)$ | Insert in sorted part |
| Merge | Yes | $O(n \log n)$ | $O(n \log n)$ | $O(n \log n)$ | $O(n)$ | Divide, Conquer, Merge |

---

## Memory Trick - B S I M

- **B**ubble = **B**ig goes last
- **S**election = **S**mallest comes first
- **I**nsertion = **I**nsert in sorted part
- **M**erge = **M**erge two sorted halves