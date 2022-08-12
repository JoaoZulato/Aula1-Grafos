public class Graph {

  private int countNodes;
  private int countEdges;
  private int[][] adjMatrix;

  public Graph(int numNodes) {
    this.countNodes = numNodes;
    this.countEdges = 0;
    this.adjMatrix = new int[numNodes][numNodes];
  }

  public void addEdge(int source, int sink, int weight) {

    if (source < 0 || source > this.adjMatrix.length - 1 ||
        sink < 0 || sink > this.adjMatrix.length - 1 || weight < 0) {
      System.err.println("invalido" + source + sink + weight);
      return;
    }
    this.countEdges++;
    this.adjMatrix[source][sink] = weight;

  }

  
  public int degree(int node) {
    int soma = 0;
    for (int i = 0; i < this.adjMatrix.length; ++i) {
      if (this.adjMatrix[node][i] != 0) {
        soma++;
      }

    }
    System.out.println(soma);
    return soma;
  }

  
  public int highestDegree() {
    int soma = 0;
    int maior = soma;
    for (int i = 0; i < this.adjMatrix.length ; ++i) {
      for (int j = 0; j < this.adjMatrix.length ; ++j) {
        if (adjMatrix[i][j] != 0)
          soma++;
      }
      if (maior <= soma)
        maior = soma;
  soma = 0;
    }
    System.out.println(maior);
    return maior;
  }

 public int lowestDegree() {
    int soma = 0;
    int maior = 99;
    for (int i = 0; i < this.adjMatrix.length ; ++i) {
      for (int j = 0; j < this.adjMatrix.length ; ++j) {
        if (adjMatrix[i][j] != 0)
          soma++;
      }
      if (maior > soma)
        maior = soma;
      
  soma = 0;
    }
    System.out.println(maior);
    return maior;
  }

  
  public String toString() {
    String str = "";
    for (int i = 0; i < this.adjMatrix.length; ++i) {
      for (int j = 0; j < this.adjMatrix.length; ++j) {
        str += this.adjMatrix[i][j] + "\t";

      }
      str += "\n";
    }
    return str;
  }

}