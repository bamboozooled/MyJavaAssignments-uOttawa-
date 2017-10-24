public class PriorityQueue implements Queue
{
        private Job[] heap;
        private int tail;

        /**
         * The constructor creates an empty array for the heap and sets the tail to 0.
         */
        public PriorityQueue()
        {
                heap = new Job[10];
                tail = 0;
        }
        
        public boolean isEmpty()
        {        
                
                return tail == 0;
        }
        
        public void enqueue(Job element)
        {
                if (tail == ((heap.length))){
                        resize();
                        heap[tail] = element;
                        reverseHeapify(tail);
                        tail++;
                }

                else{
                        heap[tail] = element;
                        reverseHeapify(tail);
                        tail++;
                }
        }
        
        public Job dequeue()
        {
                Job temp;

                int head = 0;

                int j = -1;
                
                if (tail == 0){
                        System.out.println("Nothing to dequeue");

                        return null;
                }
                
                for (int i = 0; i<heap.length; i++){
                        if (heap[i] != null){
                                j++;
                        }
                }
                
                swap(head,j);

                temp = heap[j];

                heap[j] = null;

                tail--;

                heapify(head);

                return temp;
        }
        
        public void clear()
        {
                for (int i = 0; i<heap.length; i++){
                        heap[i] = null; 
                }

                tail = 0;
        }
        
        private void resize()
        {
                Job[] newArray = new Job[0];
                int i;
                int k;
                int u=0;
                for (k=0; k<heap.length;k++){
                        if (k == heap.length-1){ // Checking to see if array is full
                        u=heap.length;}
                }
                if (u == heap.length){
                        for (i=0; i<heap.length; i++){
                        newArray=new Job[u*2];
                        newArray[i] = heap[i];}
                }
        heap = newArray;
        }
        
        private void reverseHeapify(int i)
        {
                int j = i;
                while (j < parent(j)){
                        swap(j,parent(j));
                        j = parent(j);
                }
                
        }
        
        /**
         * Given an array index i, this method returns the array index of the i's
         * parent node in the heap.
         * 
         * @param i The index of the node for whom's parent we are searching.
         * @return The index in the array of i's parent.
         */
        private int parent(int i)
        {
                return (int) Math.floor((i - 1) / 2.0f);
        }
        
        /**
         * Given an array index i, this method returns the array index of the i's
         * left child node in the heap.
         * 
         * @param i The index of the node for whom's left child we are searching.
         * @return The index in the array of i's left child.
         */
        private int left(int i)
        {
                return 2 * i + 1;
        }
        
        /**
         * Given an array index i, this method returns the array index of the i's
         * right child node in the heap.
         * 
         * @param i The index of the node for whom's right child we are searching.
         * @return The index in the array of i's right child.
         */
        private int right(int i)
        {
                return 2 * i + 2;
        }
        
        /**
         * Swaps the Job's at position i and j.
         * 
         * @param i the array index of one of the job's to be swapped.
         * @param j the array index of the other job to be swapped.
         */
        private void swap(int i, int j)
        {
                Job temp = heap[i];
                heap[i] = heap[j];
                heap[j] = temp;
        }
        
        /**
         * Heapify works by comparing the current internal node with its children 
         * to see which is the largest. If the root is not the largest then it is 
         * swapped with the largest of its children. Since the child has now been 
         * altered it needs to check to make sure it still satisfies the heap property. 
         * Heapify works its way down the tree in this manner and, when it is complete, 
         * the tree should again be a heap. The details of how Heapify works are a 
         * little complex but the method is provided for you, you just need to 
         * understand when to use it.
         * 
         * The purpose of heapify is to restore the heap property after one of the 
         * internal nodes of the heap has been altered. In the case of a priority queue,
         * this internal nodes get altered during dequeue operations.
         * 
         * @param i The index of the node that we are not certain if it satisfied the
         * heap property (one or both of its children might be larger).
         */
        private void heapify(int i)
        {
                int l = left(i);
                int r = right(i);
                int largest = i;
                
                if (l < tail && 
                    heap[l].getOwner() > heap[largest].getOwner())
                {
                        largest = l;
                }
                
                if (r < tail &&
                    heap[r].getOwner() > heap[largest].getOwner())
                {
                        largest = r;
                }
                
                if (largest != i)
                {
                        swap(i, largest);
                        heapify(largest);
                }
        }        
}