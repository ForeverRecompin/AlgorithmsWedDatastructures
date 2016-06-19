package com.nocom.datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fraj on 6/19/16 at 9:53 PM.
 */
public class AdjacencyListGraph {

    private static int INFINITY = Integer.MAX_VALUE;
    private int numberOfVerticies, sourceVertex;
    private List<List<Pair<Integer, Integer>>> adjacencyList = new ArrayList<>();

    public AdjacencyListGraph(int numberOfVerticies) {
        setNumberOfVerticies(numberOfVerticies);
        for (int i = 0; i < numberOfVerticies; i++) {
            List<Pair<Integer, Integer>> neighbor = new ArrayList<>();
            adjacencyList.add(neighbor);
        }
    }

    public void addEdgeToGraph(int fromVertex, int toVertex, int weight) {
        getAdjacencyList().get(fromVertex).add(new Pair<>(toVertex, weight));
    }

    public List<List<Pair<Integer, Integer>>> getAdjacencyList() {
        return adjacencyList;
    }

    public int getNumberOfVerticies() {
        return numberOfVerticies;
    }

    private void setNumberOfVerticies(int numberOfVerticies) {
        this.numberOfVerticies = numberOfVerticies;
    }

    public int getSourceVertex() {
        return sourceVertex;
    }

    public void setSourceVertex(int sourceVertex) {
        this.sourceVertex = sourceVertex;
    }
}