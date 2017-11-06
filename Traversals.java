import java.util.Stack;

public class Traversals
{
	void preOrderWithoutRecursion(Node root)
	{
		System.out.println("Root "+root.getData());
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while(!stack.empty())
		{
			Node node = stack.pop();
			System.out.print(node.getData()+" ");	
			if(node.getRight() != null)
			{
				stack.push(node.getRight());	
			}
			if(node.getLeft() != null)
			{
				stack.push(node.getLeft());
			}		
		}
	}

	void inOrderWithoutRecursion(Node root)
	{
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while(!stack.empty())
		{
			Node node = stack.peek();
			if(node.getLeft() != null)
			{
				//System.out.print(" "+node.getLeft());
				stack.push(node.getLeft());
			}
			else
			{
				boolean flag = true;
				while(flag)
				{
					Node poppedNode = stack.pop();
					System.out.print(poppedNode.getData()+" ");
					if(poppedNode.getRight() != null)
					{
						stack.push(poppedNode.getRight());
						flag = false;
					}
					//This condition is for rightmost element because for rightmost element getRight() will be null and it 						will again iterate in the while loop and it will give StackEmptyException
					if(stack.empty())
					{
						flag = false;
					}
				}
			}	
		}
	}	

	void postOrderTraversal(Node root)
	{
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();	
		stack1.push(root);
		while(!stack1.empty())
		{
			Node poppedNode = stack1.pop();
			stack2.push(poppedNode);
			if(poppedNode.getLeft()!=null)
			{
				stack1.push(poppedNode.getLeft());
			}
			if(poppedNode.getRight()!=null)
			{
				stack1.push(poppedNode.getRight());
			}
		}
		while(!stack2.empty())
		{
			System.out.print(stack2.pop().getData()+" ");
		}
	}	
}


