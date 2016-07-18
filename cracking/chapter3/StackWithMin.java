class StackWithMin { 
    Node top;
    int min = Integer.MAX_VALUE;
    
    int pop() {
        if (top != null) {
            int item = top.data; 
            top = top.next;
            return item;
        }
        return -1; 
    }

    void push(int item) { 
        if(item < min)
            min = item;
        Node t = new Node(item); 
        t.next = top;
        top = t;
    } 

    void imprimir(){
        while(top.next != null){
            System.out.println(top.data);
            top = top.next;
        }
        System.out.println(top.data);
    }

    int getMin(){
        return min;
    }
}


/* TEST
public class Tests {

    public static void main(String[] args) {
        StackWithMin ts = new StackWithMin();
        ts.push(10);
        ts.push(2);
        ts.push(3);
        ts.push(10);
        ts.push(20);
        ts.push(30);
        ts.push(100);
        ts.push(200);
        ts.push(300);
        ts.imprimir();
        System.out.println(ts.getMin());

    }
}


*/