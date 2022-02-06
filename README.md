# Binary Search Tree - Scapegoat tree

# Goal:

In this problem, I am trying to create a binary search tree. My goal in doing so is to create a machine that can search an array a lot faster than a simple brute force algorithm to search said array.

# Methodology:

To implement this binary search tree, I defined the array as a tree data structure and implemented a number of algorithms that would help to search the tree faster than brute force. Some of the algorithms I implemented are Depth-First Search (DFS), Breadth-First Search (BFS), in-order traversal, pre-order traversal, post-order traversal. The tree data structure is also dynamic, as it can be altered via insertion and deletion and it can also be balanced. The way that the binary tree is balanced is by using a “scapegoat tree”. This allows the binary tree to balance itself. The purpose of creating a self-balancing tree is so that search requires O(logn) runtime as opposed to O(n), thus beating brute force search.
