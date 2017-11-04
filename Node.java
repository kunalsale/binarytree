class Node 
{
	private int data;
	private Node left;
	private Node right;
	
	Node(int data)
	{
		this.data = data;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public void setLeft(Node node)
	{
		this.left = node;
	}

	public void setRight(Node node)
	{
		this.right = node;
	}

	public int getData()
	{
		return data;
	}

	public Node getLeft()
	{
		return left;
	}

	public Node getRight()
	{
		return right;
	}
}
