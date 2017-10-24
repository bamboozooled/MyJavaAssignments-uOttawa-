public class LinkedListQueue implements Queue{
    public static class Node{
        Job value;
        Node next;

        public Node(Job value, Node next ){
            this.value = value;
            this.next = next;
        }

        public Job getValue(){
            return this.value;
        }

        public Node getNext(){
            return this.next;
        }

        public void setValue(Job value2){
            this.value = value2;
        }

        public void setNext(Node next2){
            this.next = next2;
        }
    }

    public Node initialize;
    public Node temp;
    private Node head;
    private Node tail;
    public LinkedListQueue(){
        this.head = null;
        this.tail = null;
    }

     public boolean isEmpty(){
        if (this.head == null){ //&& this.tail == null){
            return true;
        }

        else {
            return false;
        }
    }

    public void enqueue(Job newJob){
        
        if (isEmpty()){
            this.head = new Node(newJob, null);
            this.tail = head;
        }

        else{

            this.tail.next = new Node(newJob, null);

            this.tail = this.tail.next;
        }
    }


    private Node save;
    private Job deqVal = null;
    public Job dequeue(){

        //if (this.isEmpty() == false){
           
        save = this.head;
            
        this.head = this.head.next;

        deqVal = save.value;
        //}

        return deqVal;
    }
    public int indexofAll(Job elem){
        Job pointer = this.head;
        int array[] = new int[this.size()];
        count = 0;
        int i = 0;

        if (pointer == null){
            return;
        }
        
        else{
            while(pointer != null){
                if (pointer == elem){
                    array[i] = count;
                    pointer = pointer.next;
                }

                else{
                    count++;
                    pointer = pointer.next;
                }
            }
        }
    }

    Job pointer = this.head;
    public int indexofAll(Job elem){
        count = 0;

        if (pointer == null){
            return;
        }
        
        else{
            while(pointer != null){
                if (pointer == elem){
                    pointer = pointer.next;
                    indexofAll(elem);
                    return count;
                }

                else{
                    count++;
                    pointer = pointer.next;
                }
            }
        }
    }

    public void clear(){
        this.head = null;
        this.tail = null;
    }
}