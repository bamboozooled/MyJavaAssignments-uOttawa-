public interface Stack<T>{
    public boolean isEmpty();
    public boolean isFull();
    public T peek();
    public T pop();
    public void push(T obj);
    public void clear();
    public int size();

    public void reverse();
    public void display();
    
}