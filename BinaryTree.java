import java.util.*;

public class BinaryTree
{
	public static void main(String[] args)
	{
		Scanner scr = new Scanner(System.in);
		int choice = 0;
		BTClass btClass = new BTClass();
		Traversals traversals = new Traversals();	
		do
		{
			System.out.println("------------Menu-------------");
			System.out.println("1. To insert Node");
			System.out.println("2. PreOrder Traversal");
			System.out.println("3. InOrder Traversal");
			System.out.println("4. PostOrder Traversal");
			System.out.println("5. Level Order Traversal");
			System.out.println("6. Heigth of a Tree");
			System.out.println("7. PreOrder without Recursion");
			System.out.println("8. InOrder without Recursion");
			System.out.println("9. PostOrder without Recursion");
			System.out.println("10. Exit");
			System.out.println("-----------------------------");
			System.out.print("Enter your choice:");
			choice = scr.nextInt();
			System.out.println();
			switch(choice)
			{
				case 1:
				int data;
				System.out.println("Enter data to be inserted: ");
				data = scr.nextInt();		
				btClass.insertNode(data);
				break;
				case 2:System.out.print("PreOrder Traversal: ");	
					btClass.printTree(0);
					break;
				case 3:System.out.print("InOrder Traversal: ");	
					btClass.printTree(1);
					break;
				case 4:System.out.print("PostOrder Traversal: ");		
					btClass.printTree(2);
					break;
				case 5:System.out.print("Level Order Traversal: ");	
					btClass.printTree(3);
					break;
				case 6:System.out.println(btClass.heigthOfATree()+" ");
					break;
				case 7:traversals.preOrderWithoutRecursion(btClass.getRoot());
					break;
				case 8:traversals.inOrderWithoutRecursion(btClass.getRoot());
					break;
				case 9:traversals.postOrderTraversal(btClass.getRoot());
					break;
			}
			System.out.println();
		}
		while(choice < 9 && choice > 0);
		
	}
}
