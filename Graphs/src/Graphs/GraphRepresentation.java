package Graphs;

public class GraphRepresentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Graph g=new Graph(6);
		TopologicalSort t=new TopologicalSort(6);
		g.addedge(0,2);
		g.addedge(0,3);
		g.addedge(3,1);
		g.addedge(4,2);
		g.addedge(4,1);
		g.addedge(5,0);
		g.addedge(5,2);
		
		t.addedge(0,2);
		t.addedge(0,3);
		t.addedge(3,1);
		t.addedge(4,2);
		t.addedge(4,1);
		t.addedge(5,0);
		t.addedge(5,2);
		
		
		g.dfs(0);
		

	}

}
