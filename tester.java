package dijkstraalgorithm;


import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HW14_tester {
    public static void main(String[] args) throws FileNotFoundException {
       
        ArrayList<String[]> connections = new EdgeReader("C:\\Users\\gianm\\Desktop\\2023-2024\\COLLEGE\\Spring 2024\\CIS 27\\ASSIGN14\\HW14_graph.csv").read();
        EdgeWeightedDigraph graph = new EdgeWeightedDigraph(51);
        
        for (String[] arr : connections) {
            Edge edge = new Edge(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Double.parseDouble(arr[2]));
            Edge edge_back = new Edge(Integer.parseInt(arr[1]), Integer.parseInt(arr[0]), Double.parseDouble(arr[2]));
            graph.addEdge(edge);
            graph.addEdge(edge_back);
        }
        
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph,50);
        
        for (int i = 0; i < 50; i++) {
            Iterable<Edge> path = dijkstra.pathTo(i);
            double total_distance = 0;
            for (Edge edge : path) {
                total_distance += edge.weight();
            }
            if (total_distance != 0.0) {
                System.out.println("Shortest Path to: " + i);
                for (Edge edge : path) {
                    if (edge.weight() != 0.0) {
                        System.out.println("    " + edge);
                    }
                }
                System.out.println("Total cost: " + total_distance);
                System.out.println("----------------------------------------");
            }  
        }
    }
}

/*OUTPUT

Shortest Path to: 0
    vertex 7 --> vertex 5, cost: 15.00
    vertex 5 --> vertex 6, cost: 20.00
    vertex 6 --> vertex 0, cost: 17.00
Total cost: 52.0
----------------------------------------
Shortest Path to: 1
    vertex 7 --> vertex 5, cost: 15.00
    vertex 5 --> vertex 1, cost: 13.00
Total cost: 28.0
----------------------------------------
Shortest Path to: 2
    vertex 14 --> vertex 3, cost: 15.00
    vertex 3 --> vertex 2, cost: 15.00
Total cost: 30.0
----------------------------------------
Shortest Path to: 3
    vertex 14 --> vertex 3, cost: 15.00
Total cost: 15.0
----------------------------------------
Shortest Path to: 4
    vertex 7 --> vertex 4, cost: 31.00
Total cost: 31.0
----------------------------------------
Shortest Path to: 5
    vertex 7 --> vertex 5, cost: 15.00
Total cost: 15.0
----------------------------------------
Shortest Path to: 6
    vertex 7 --> vertex 5, cost: 15.00
    vertex 5 --> vertex 6, cost: 20.00
Total cost: 35.0
----------------------------------------
Shortest Path to: 8
    vertex 14 --> vertex 3, cost: 15.00
    vertex 3 --> vertex 8, cost: 15.00
Total cost: 30.0
----------------------------------------
Shortest Path to: 9
    vertex 14 --> vertex 3, cost: 15.00
    vertex 3 --> vertex 9, cost: 31.00
Total cost: 46.0
----------------------------------------
Shortest Path to: 10
    vertex 14 --> vertex 12, cost: 22.00
    vertex 12 --> vertex 10, cost: 22.00
Total cost: 44.0
----------------------------------------
Shortest Path to: 11
    vertex 40 --> vertex 45, cost: 20.00
    vertex 45 --> vertex 11, cost: 21.00
Total cost: 41.0
----------------------------------------
Shortest Path to: 12
    vertex 14 --> vertex 12, cost: 22.00
Total cost: 22.0
----------------------------------------
Shortest Path to: 13
    vertex 14 --> vertex 15, cost: 36.00
    vertex 15 --> vertex 13, cost: 28.00
Total cost: 64.0
----------------------------------------
Shortest Path to: 15
    vertex 14 --> vertex 15, cost: 36.00
Total cost: 36.0
----------------------------------------
Shortest Path to: 16
    vertex 7 --> vertex 16, cost: 25.00
Total cost: 25.0
----------------------------------------
Shortest Path to: 17
    vertex 7 --> vertex 17, cost: 20.00
Total cost: 20.0
----------------------------------------
Shortest Path to: 18
    vertex 14 --> vertex 21, cost: 16.00
    vertex 21 --> vertex 18, cost: 20.00
Total cost: 36.0
----------------------------------------
Shortest Path to: 19
    vertex 14 --> vertex 19, cost: 23.00
Total cost: 23.0
----------------------------------------
Shortest Path to: 20
    vertex 14 --> vertex 20, cost: 35.00
Total cost: 35.0
----------------------------------------
Shortest Path to: 21
    vertex 14 --> vertex 21, cost: 16.00
Total cost: 16.0
----------------------------------------
Shortest Path to: 22
    vertex 28 --> vertex 22, cost: 30.00
Total cost: 30.0
----------------------------------------
Shortest Path to: 23
    vertex 28 --> vertex 23, cost: 18.00
Total cost: 18.0
----------------------------------------
Shortest Path to: 24
    vertex 25 --> vertex 24, cost: 25.00
Total cost: 25.0
----------------------------------------
Shortest Path to: 26
    vertex 25 --> vertex 26, cost: 30.00
Total cost: 30.0
----------------------------------------
Shortest Path to: 27
    vertex 28 --> vertex 27, cost: 43.00
Total cost: 43.0
----------------------------------------
Shortest Path to: 29
    vertex 25 --> vertex 24, cost: 25.00
    vertex 24 --> vertex 29, cost: 15.00
Total cost: 40.0
----------------------------------------
Shortest Path to: 30
    vertex 25 --> vertex 30, cost: 30.00
Total cost: 30.0
----------------------------------------
Shortest Path to: 31
    vertex 25 --> vertex 31, cost: 21.00
Total cost: 21.0
----------------------------------------
Shortest Path to: 32
    vertex 7 --> vertex 32, cost: 30.00
Total cost: 30.0
----------------------------------------
Shortest Path to: 33
    vertex 40 --> vertex 46, cost: 28.00
    vertex 46 --> vertex 33, cost: 30.00
Total cost: 58.0
----------------------------------------
Shortest Path to: 34
    vertex 28 --> vertex 34, cost: 33.00
Total cost: 33.0
----------------------------------------
Shortest Path to: 35
    vertex 28 --> vertex 35, cost: 25.00
Total cost: 25.0
----------------------------------------
Shortest Path to: 36
    vertex 40 --> vertex 36, cost: 30.00
Total cost: 30.0
----------------------------------------
Shortest Path to: 37
    vertex 25 --> vertex 37, cost: 50.00
Total cost: 50.0
----------------------------------------
Shortest Path to: 38
    vertex 25 --> vertex 31, cost: 21.00
    vertex 31 --> vertex 38, cost: 40.00
Total cost: 61.0
----------------------------------------
Shortest Path to: 39
    vertex 40 --> vertex 39, cost: 40.00
Total cost: 40.0
----------------------------------------
Shortest Path to: 41
    vertex 40 --> vertex 41, cost: 27.00
Total cost: 27.0
----------------------------------------
Shortest Path to: 42
    vertex 28 --> vertex 34, cost: 33.00
    vertex 34 --> vertex 42, cost: 20.00
Total cost: 53.0
----------------------------------------
Shortest Path to: 43
    vertex 40 --> vertex 41, cost: 27.00
    vertex 41 --> vertex 43, cost: 14.00
Total cost: 41.0
----------------------------------------
Shortest Path to: 44
    vertex 28 --> vertex 34, cost: 33.00
    vertex 34 --> vertex 42, cost: 20.00
    vertex 42 --> vertex 44, cost: 24.00
Total cost: 77.0
----------------------------------------
Shortest Path to: 45
    vertex 40 --> vertex 45, cost: 20.00
Total cost: 20.0
----------------------------------------
Shortest Path to: 46
    vertex 40 --> vertex 46, cost: 28.00
Total cost: 28.0
----------------------------------------
Shortest Path to: 47
    vertex 40 --> vertex 41, cost: 27.00
    vertex 41 --> vertex 43, cost: 14.00
    vertex 43 --> vertex 47, cost: 15.00
Total cost: 56.0
----------------------------------------
Shortest Path to: 48
    vertex 40 --> vertex 46, cost: 28.00
    vertex 46 --> vertex 48, cost: 15.00
Total cost: 43.0
----------------------------------------
Shortest Path to: 49
    vertex 40 --> vertex 46, cost: 28.00
    vertex 46 --> vertex 49, cost: 35.00
Total cost: 63.0
----------------------------------------

*/