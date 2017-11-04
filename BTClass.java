class BTClass
{
	private Node root;

	Node insertNode(int data)
	{
		root = prepareTree(root,data);
		return root;	
	}
	
	// Inserts the node into the tree recursively
	Node prepareTree(Node node, int data)
	{
		if(node == null)
		{
			return new Node(data);
		}
		else
		{
			if(data <= node.getData())
			{
				node.setLeft(prepareTree(node.getLeft(),data));
			}
			else
			{
				node.setRight(prepareTree(node.getRight(),data));
			}
		}
		return node;
	}

	void printTree(int type)
	{
		switch(type)
		{
			case 0:preOrderTraversal(root);
				break;
			case 1:inorderTraversal(root);
				break;
			case 2:postOrderTraversal(root);
				break;
			case 3:levelOrderTraversal(root);
				break;
		}
		System.out.println();
	}
	
	// InOrder Traversal
	private void inorderTraversal(Node node)
	{
		if(node == null)
		{
			return;
		}
		inorderTraversal(node.getLeft());
		System.out.print(node.getData()+" ");
		inorderTraversal(node.getRight());
	}
	
	// PreOrder Traversal
	private void preOrderTraversal(Node node)
	{
		if(node == null)
			return;
		System.out.print(node.getData()+" ");
		preOrderTraversal(node.getLeft());
		preOrderTraversal(node.getRight());
	}

	// PostOrder Traversal
	private void postOrderTraversal(Node node)
	{
		if(node == null)
		{
			return;
		}
		postOrderTraversal(node.getLeft());
		postOrderTraversal(node.getRight());
		System.out.print(node.getData()+" ");
	}

	void levelOrderTraversal(Node node)
	{
		int h = getHeight(root);
		for(int i = 0; i < h; i++)
		{
			printLevelNodes(root,i);
		}
	}

	// Level Order Traversal
	private void printLevelNodes(Node node,int level)	
	{
		if(node == null)
		{
			return;
		}
		if(level == 0 && node != null)
		{
			System.out.print(node.getData()+" ");
		}
		else
		{
			printLevelNodes(node.getLeft(),level-1);
			printLevelNodes(node.getRight(),level-1);
		}
	}

	int heigthOfATree()
	{
		return getHeight(root);
	}

	// calculates the height of the tree
	private int getHeight(Node node)
	{
		if(node == null)
		{	
			return 0;
		}
		else
		{
			return maxOf(getHeight(node.getLeft()),getHeight(node.getRight()))+1;
		}
	}

	private int maxOf(int left, int rigth)
	{
		return (left > rigth)?left:rigth;
	}
	
	Node getRoot()
	{
		return root;
	}
}

