package classes;

public class Grafo {
    private int[][] matrizAdjacencia;
    private int numeroVertices;

    public Grafo(int numeroVertices) {
        this.numeroVertices = numeroVertices;
        matrizAdjacencia = new int[numeroVertices][numeroVertices];
    }

    public void adicionarAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem >= 0 && verticeOrigem < numeroVertices && verticeDestino >= 0 && verticeDestino < numeroVertices) {
            matrizAdjacencia[verticeOrigem][verticeDestino] = 1;
            matrizAdjacencia[verticeDestino][verticeOrigem] = 1;
        } else {
            System.out.println("Vértices inválidos.");
        }
    }

    public void removerAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem >= 0 && verticeOrigem < numeroVertices && verticeDestino >= 0 && verticeDestino < numeroVertices) {
            matrizAdjacencia[verticeOrigem][verticeDestino] = 0;
            matrizAdjacencia[verticeDestino][verticeOrigem] = 0;
        } else {
            System.out.println("Vértices inválidos.");
        }
    }

    public void exibirGrafo() {
        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                System.out.print(matrizAdjacencia[i][j] + " ");
            }
            System.out.println();
        }
    }
}