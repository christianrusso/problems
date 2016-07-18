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
