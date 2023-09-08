package arvorebinaria;

import java.util.ArrayList;
import java.util.Scanner;

class No {
    int data;
    No left;
    No right;

    public No(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Arvorebinaria {
    private No raiz;
    private ArrayList<No> listaNos;

    public Arvorebinaria() {
        this.raiz = null;
        this.listaNos = new ArrayList<>();
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (raiz == null) {
            raiz = novoNo;
        } else {
            inserirRecursivo(raiz, novoNo);
        }
        listaNos.add(novoNo);
    }

    private void inserirRecursivo(No noAtual, No novoNo) {
        if (novoNo.data < noAtual.data) {
            if (noAtual.left == null) {
                noAtual.left = novoNo;
            } else {
                inserirRecursivo(noAtual.left, novoNo);
            }
        } else {
            if (noAtual.right == null) {
                noAtual.right = novoNo;
            } else {
                inserirRecursivo(noAtual.right, novoNo);
            }
        }
    }

    public void exibir() {
        for (No no : listaNos) {
            String filhoEsquerdo = (no.left != null) ? String.valueOf(no.left.data) : "nulo";
            String valorAtual = String.valueOf(no.data);
            String filhoDireito = (no.right != null) ? String.valueOf(no.right.data) : "nulo";

            System.out.println(filhoEsquerdo + " <- " + valorAtual + " -> " + filhoDireito);
        }
    }

    public static void main(String[] args) {
        Arvorebinaria arvore = new Arvorebinaria();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Digite um valor numérico (-0 para encerrar): ");
                int valor = scanner.nextInt();
                if (valor == 0) {
                    break;
                }
                arvore.inserir(valor);
            }
        }

        System.out.println("Árvore binária criada com sucesso!");
        System.out.println("Exibindo os nós da árvore:");
        arvore.exibir();
    }
}
