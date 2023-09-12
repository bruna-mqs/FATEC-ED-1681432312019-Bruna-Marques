package Arvore;

import java.util.Scanner;

public class ArvoreBinaria {
    static class Node {
        int value;
        Node left, right;

        public Node(int item) {
            value = item;
            left = right = null;
        }
    }

    Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void printTree(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.value);

            printTree(node.left, prefix + (isLeft ? "│   " : "    "), true);
            printTree(node.right, prefix + (isLeft ? "│   " : "    "), false);
        }
    }

    public static void main(String[] args) {
        ArvoreBinaria tree = new ArvoreBinaria();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do nó principal: ");
        int rootValue = scanner.nextInt();
        tree.insert(rootValue);

        while (true) {
            System.out.print("Digite o próximo valor (ou -1 para sair): ");
            int value = scanner.nextInt();

            if (value == -1) {
                break;
            }

            tree.insert(value);
        }

        System.out.println("Representação da árvore:");
        tree.printTree(tree.root, "", false);

        scanner.close();
    }
}
