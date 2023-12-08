package day10;

import java.util.Scanner;

class Node {
	int value;
	Node left, right;

	public Node(int item) {
		value = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;

	void insert(int value) {
		root = insertRec(root, value);
	}

	Node insertRec(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}
		if (value < root.value)
			root.left = insertRec(root.left, value);
		else if (value > root.value)
			root.right = insertRec(root.right, value);
		return root;
	}

	void inorder()  {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.value);
			inorderRec(root.right);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите числа для добавления в дерево (для завершения введите 'q'):");
		while (scanner.hasNextInt()) {
			tree.insert(scanner.nextInt());
		}

		System.out.println("Вывод дерева:");
		tree.inorder();
	}
}

