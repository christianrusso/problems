import java.util.ArrayList;


public class Backtrack {

	public static void main(String[] args) {
		Tablero t = new Tablero(8,8);
	
		int cantReinas = 8;
		Tablero result;
		result = resolver(t,0,cantReinas);
		
		if(result != null){
			result.imprimir();
		}else{
			System.out.print("No tiene Solucion");
		}
		
	}
	
	public static Tablero resolver(Tablero t,int i,int cantReinas){
		ArrayList<Tuple> posValidas = new ArrayList<Tuple>();
		if ((i == t.getN()) || (cantReinas == 0)){ 
			return t;
		}
		posValidas = conseguirPosValidas(t,i);
		
		for (int j = 0; j < posValidas.size(); j++) {
			Tablero r = ponerReina(t,posValidas.get(j));
			cantReinas--;
			Tablero rr = resolver(r,i+1, cantReinas);
			if(rr != null){ 
				return rr;
			}
			cantReinas++;
		}
		return null;
	}
	
	public static ArrayList<Tuple> conseguirPosValidas(Tablero t, int i){
		ArrayList<Tuple> list = new ArrayList<Tuple>();
		for (int j = 0; j < t.getM(); j++) {
			if(t.getTablero()[i][j] == 0){
				Tuple tp = new Tuple(i,j);
				list.add(tp);
			}
		}
		return list;
	}
	
	public static Tablero ponerReina(Tablero t, Tuple p){
		Tablero t2 = copiar(t);
		t2.getTablero()[p.x][p.y] = 2;
		reinaMata(t2,p);
		return t2;
	}
	
	public static void reinaMata(Tablero t, Tuple p){
			for (int j = 0; j < t.getM(); j++) {
				if(j != p.y)
				t.getTablero()[p.x][j] = 1;
			}
			for (int j = 0; j < t.getM(); j++) {
				if(j != p.x)
				t.getTablero()[j][p.y] = 1;
			}
			for (int i = p.x+1, j=p.y+1; (i < t.getN()) && (j < t.getM()); i++,j++) {
				t.getTablero()[i][j] = 1;
			}
			for (int i = p.x-1, j=p.y-1; (i >= 0) && (j >= 0); i--,j--) {
				t.getTablero()[i][j] = 1;
			}
			
			for (int i = p.x-1, j=p.y+1; (i >= 0) && (j < t.getM()); i--,j++) {
				t.getTablero()[i][j] = 1;
			}
			for (int i = p.x+1, j=p.y-1; (i < t.getM()) && (j >= 0); i++,j--) {
				t.getTablero()[i][j] = 1;
			}

	}
	
	public static Tablero copiar(Tablero t1){
		Tablero result = new Tablero(t1.getN(),t1.getM());
		for (int i = 0; i < result.getN(); i++) {
			for (int j = 0; j < result.getM(); j++) {
				result.tablero[i][j] = t1.getTablero()[i][j];
			}
		}
		return result;
	}
}




