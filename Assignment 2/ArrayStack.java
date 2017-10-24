public class ArrayStack<T> implements Stack<T>{
    private int init;
    private T[] elems;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack(int init){
        elems = (T[]) new Object[init]; //Initial capacity
        top = 0;
    }

    public boolean isEmpty(){
        return top == 0; // top == 0 means it is empty

    }

    public boolean isFull(){
        if ((top) == init){ // Checking to see if top is equal to intital capacity. Meaning full.
            return true;
        }

        else{
            return false;
        }

    }

    public T peek(){
        return elems[top-1]; //Looking at last element
    }
    @SuppressWarnings("unchecked")
    public T pop(){
        T[] temp = (T[]) new Object[1];
        temp[0] = elems[top-1];
        elems[top-1] = null;
        top = top-1;
        return temp[0];
    }

    public void push(T elem){
        elems[top] = elem; //Adding element
        top++;
    }
    @SuppressWarnings("unchecked")
    public void clear(){
        top = 0;
        
        for (int i = 0; i<elems.length; i++){
            elems[i] = null; // Scrubbing every element
        }
    }

    public int size(){
        return top-1; // Returning size
    }
    @SuppressWarnings("unchecked")
    public void reverse(){
        int l = 0;
        T[] elems2 = (T[]) new Object[elems.length];
        int randomTop = top;
        top = elems.length-1;
        for (int i = 0; i<elems.length; i++){
            elems2[l] = elems[top];
            top = top-1;
            l = l+1;
        }

        top = randomTop;

        elems = elems2;
    }

    public void display(){
            System.out.println(toString()); // Display stack .toString
    }

    public String toString(){
        String[] z = new String[elems.length];
        String a = "";
        for (int i = 0; i<elems.length; i++){
            z[i] =  String.valueOf(elems[i]); // Displaying each element of the stack
            a = a + z[i] + " ";
        }

        return a;
    }
    
}