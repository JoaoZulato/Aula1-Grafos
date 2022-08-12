class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Graph g1 = new Graph(5);
    g1.addEdge(0, 1, 1);
    g1.addEdge(1, 2, 1);
    g1.addEdge(1, 3, 1);
    g1.addEdge(2, 3, 1);
    g1.addEdge(2, 1, 1);
    g1.addEdge(2, 4, 1);
    g1.addEdge(3, 2, 1);
    g1.addEdge(4, 1, 1);
    g1.addEdge(4, 3, 1);
    g1.toString();
    g1.highestDegree();
 
     System.out.println(g1);
  }
}