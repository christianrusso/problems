import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		Tuple start = new Tuple(0, 0);
		Tuple end = new Tuple(20,3);
		
		System.out.print(bfs(start,end));

	}
	
	
	public static int bfs(Tuple start, Tuple end){
		Queue<Nodo> q = new LinkedList<Nodo>();
		Set<Tuple> visited = new HashSet<Tuple>();
		Nodo n = new Nodo(start,0);
		q.add(n);
		
		while (!q.isEmpty()) {
		       Nodo actual = q.remove();

		       if (actual.tupla.equals(end)) { return actual.nivel; }
		       
		       visited.add(actual.tupla);
		       Set<Tuple> ngs = get_neighbors(actual.tupla);
		       for (Tuple nn : ngs) {
		    	   if(visited.contains(nn)){
		    		   q.add(new Nodo(nn,actual.nivel + 1));
		    	   }
		       }
		   }
		return -1;

	}
	
	
	public static Set<Tuple> get_neighbors(Tuple p) {
		   int x = p.x;
		   int y = p.y;

		   Set<Tuple> result = new HashSet<Tuple>();
		   result.add(new Tuple(x - 2, y - 1));
		   result.add(new Tuple(x - 2, y + 1));
		   result.add(new Tuple(x + 2, y - 1));
		   result.add(new Tuple(x + 2, y + 1));
		   result.add(new Tuple(x - 1, y - 2));
		   result.add(new Tuple(x - 1, y + 2));
		   result.add(new Tuple(x + 1, y - 2));
		   result.add(new Tuple(x + 1, y + 2));

		   return result;
		}

}
