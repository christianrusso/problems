public class Tuple { 
  public final int x; 
  public final int y; 
  
  public Tuple (int x, int y) { 
    this.x = x; 
    this.y = y; 
  }
  
  public boolean equals(Tuple other) {
      if ((other.x == this.x)&&(other.y == this.y)) {
          return true;
      }else{
    	  return false;
      }
  }
} 