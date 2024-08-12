package dijkstraalgorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class DijkstraAlgorithm {

	static class AdjListNode{
		int w,v;
		
		public AdjListNode(int v,int w) {
			this.v=v;
			this.w=w;
		}
	}
	
	public static void dijkstra(ArrayList<ArrayList<AdjListNode> > graph) {
		int weight=0;
		PriorityQueue<AdjListNode> q = new PriorityQueue<>(
	            (v1, v2) -> v1.w - v2.w);
		
		Set s=new HashSet();
		
		q.add(new AdjListNode(0,0));
		
		
		while(!q.isEmpty()) {
			AdjListNode n=q.poll();
			System.out.println("pop "+n.v);
			if(s.contains(n.v))
			{
				System.out.println(n.v+" already present");
				continue;
			}
			s.add(n.v);
			
			
			weight=n.w;
			System.out.println("weight="+weight);
			ArrayList<AdjListNode>temp=graph.get(n.v);
			for(int i=0;i<temp.size();++i)
			{
				if(!s.contains(temp.get(i).v))
				{
					temp.get(i).w=weight+temp.get(i).w;
					System.out.println("offer="+temp.get(i).v+" "+temp.get(i).w);
				    q.offer(temp.get(i));
				}
					
			}
		}
		System.out.println("weight="+weight);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<AdjListNode> > graph
        = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
            graph.add(new ArrayList<>());
        }
		graph.get(0).add(new AdjListNode(1, 1));
        graph.get(0).add(new AdjListNode(2,4));
        graph.get(1).add(new AdjListNode(0,1));
        graph.get(1).add(new AdjListNode(2,4));
        graph.get(1).add(new AdjListNode(3,2));
        graph.get(1).add(new AdjListNode(4,7));
        graph.get(2).add(new AdjListNode(0,4));
        graph.get(2).add(new AdjListNode(1,4));
        graph.get(2).add(new AdjListNode(3,3));
        graph.get(2).add(new AdjListNode(4,5));
        graph.get(3).add(new AdjListNode(2,3));
        graph.get(3).add(new AdjListNode(1,2));
        graph.get(3).add(new AdjListNode(4,4));
        graph.get(3).add(new AdjListNode(5,6));
        graph.get(4).add(new AdjListNode(1,7));
        graph.get(4).add(new AdjListNode(2,5));
        graph.get(4).add(new AdjListNode(3,4));
        graph.get(4).add(new AdjListNode(5,7));
        graph.get(5).add(new AdjListNode(4,7));
        graph.get(5).add(new AdjListNode(3,6));
        
        dijkstra(graph);

	}

}
