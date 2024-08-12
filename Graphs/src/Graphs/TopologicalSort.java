package Graphs;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort {

	ArrayList<ArrayList<Integer>>adjlist=new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer>visiteddfs=new ArrayList<Integer>();
	Stack<Integer>s=new Stack<Integer>();
	
	public TopologicalSort(int n) {
		for(int i=0;i<n;++i)
		{
			adjlist.add(new ArrayList<Integer>());
		}
	}
	
	public void addedge(int u,int v) {
		adjlist.get(u).add(v);
		
	}
	
	public void dfs(int index) {
		
		
		if(visiteddfs.contains(index))
		return;
		else if(adjlist.get(index).isEmpty())
		{
			s.push(index);
			visiteddfs.add(index);
			return;
		}
		else
			visiteddfs.add(index);
		for(int i=0;i<adjlist.get(index).size();++i )
	    {
		
		   if(!visiteddfs.contains(adjlist.get(index).get(i)))
		   dfs(adjlist.get(index).get(i));
	    }
	    s.push(index);
	
	
   }
	
	public void topologicalsort() {
		for(int i=0;i<adjlist.size();++i)
		{
			System.out.println(i);
			if(visiteddfs.contains(i))
				continue;
			else
				dfs(i);
		}
		
		System.out.println("final res");
		while(!s.isEmpty())
			System.out.println(s.pop());
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
