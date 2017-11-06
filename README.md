implementation## Binary Tree Implementation and traversals

Binary tree is a tree which each node contains 0, 1 or 2 childrens. 

**Traversals in Binary Tree**:

                   5
                /     \
              3        10 
            /         /   \
          2         7      11
                     \
                      8
                      
1.  PreOrder Traversal:  V L R<br>
      Preorder for above tree - > 5 3 2 10 7 8 11
      
2. InOrder Traversal : L V R<br>
      InOrder for above tree - >  2 3 5 7 8 10 11
      
3. PostOrder Traversal : L R V<br>
       PostOrder for above tree - >  2 3 8 7 11 10 5
       
4. Level Order Traversal : Prints nodes level wise<br>
      Level Order ->  5 3 10 2 7 11 8

V means Visiting the node and printing it<br>

**Height of a Node** is a number of nodes in the longest path between node and leaf node in downward direction.<br>

Height of _tree_ is a height of _root_ node.<br>

**Depth of a Tree** is the number of edges between root and the furthest leaf node.<br>
