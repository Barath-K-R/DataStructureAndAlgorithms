package Graphs;

import java.util.ArrayList;
import java.util.*;

public class Graph {
	ArrayList<ArrayList<Integer>>adjlist=new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer>visiteddfs=new ArrayList<Integer>();
	
	public Graph(int n) {
		for(int i=0;i<n;++i)
		{
			adjlist.add(new ArrayList<Integer>());
		}
	}
	
	public void addedge(int u,int v) {
		adjlist.get(u).add(v);
		adjlist.get(v).add(u);
	}
	
	public void bfs(int vertex) {
		
		ArrayList<Integer> visited=new ArrayList<Integer>();
		
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(vertex);
		visited.add(vertex);
		
		while(!q.isEmpty())
		{
			vertex=q.poll();
			System.out.println(vertex);
			for(int j=0;j<adjlist.get(vertex).size();++j)
			{
				int av=adjlist.get(vertex).get(j);
				if(!visited.contains(av))
				{
				      	q.add(av);
				      	visited.add(av);
				}
			}
		}
		
		
	}
	public void dfs(int vertex) {
		    visiteddfs.add(vertex);
			System.out.println(vertex);
		for(int i=0;i<adjlist.get(vertex).size();++i )
		{
			if(!visiteddfs.contains(adjlist.get(vertex).get(i)))
			dfs(adjlist.get(vertex).get(i));
		}
		
		
	}
	public void printadjlist() {
		for(int i=0;i<adjlist.size();++i) {
			System.out.println(i);
			for(int j=0;j<adjlist.get(i).size();++j)
			{
				System.out.println(" "+adjlist.get(i).get(j));
			}
		}
		
	}

}
