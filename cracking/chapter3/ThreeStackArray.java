class ThreeStackArray {

        int stackSize = 3;
        int[] buffer = new int[stackSize*3];
        int[] stackPointer = {0,0,0};

        void push(int numStack, int value){
            int index = stackSize * numStack + stackPointer[numStack];
            buffer[index] = value;
            stackPointer[numStack]++;
        }

        int pop(int numStack){
            int index = (stackSize*numStack)-1 + stackPointer[numStack];
            int value = buffer[index];
            buffer[index] = 0;
            stackPointer[numStack]--;
            return value;
        }

        int peek(int numStack){
            int index = (stackSize*numStack)-1 + stackPointer[numStack];
            return buffer[index];
        }
        
        void imprimir(){
            for (int i=0;i< buffer.length ; i++) {
                System.out.println(buffer[i]);
            }
        }

        boolean isEmpty(int numStack){
            return (stackPointer[numStack] == 0); 
        }
}


/*
Algunos tests:

public class Tests {

    public static void main(String[] args) {
        ThreeStackArray ts = new ThreeStackArray();
        ts.push(0,1);
        ts.push(0,2);
        ts.push(0,3);
        ts.push(1,10);
        ts.push(1,20);
        ts.push(1,30);
        ts.push(2,100);
        ts.push(2,200);
        ts.push(2,300);
        System.out.println(ts.pop(1));
        System.out.println(ts.isEmpty(1));
        ts.imprimir();

    }


}

*/