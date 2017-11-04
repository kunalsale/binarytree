import java.util.*;

public class BinaryTree
{
	public static void main(String[] args)
	{
		Scanner scr = new Scanner(System.in);
		int choice = 0;
		BTClass btClass = new BTClass();	
		do
		{
			System.out.println("------------Menu-------------");
			System.out.println("1. To insert Node");
			System.out.println("2. PreOrder Traversal");
			System.out.println("3. InOrder Traversal");
			System.out.println("4. PostOrder Traversal");
			System.out.println("5. Level Order Traversal");
			System.out.println("6. Heigth of a Tree");
			System.out.println("7. Exit");
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
			}
		}
		while(choice < 7 && choice > 0);
		
	}
}
