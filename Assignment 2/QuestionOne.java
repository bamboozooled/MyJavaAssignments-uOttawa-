public class QuestionOne{
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        // Array Stack
        Stack<Integer> elems1 = new ArrayStack<Integer>(20);

        for (int i = 1; i<=20; i++){
            elems1.push(i);
        }

        elems1.display(); //First Display

        elems1.reverse(); //Reversing stack

        elems1.display(); //Displaying reveresed stack

        System.out.println(elems1.peek()); // Peeking

        elems1.pop(); // Popping the first time

        elems1.pop(); // Popping the second time
        
        elems1.reverse(); //Second reverse  

        System.out.println(elems1.size()); //Size of elems

        System.out.println(elems1.isFull()); // If its full

        System.out.println(elems1.isEmpty()); // If its empty

        elems1.display(); // Second display

        elems1.clear(); // Clear stack

        elems1.display(); // Third display

        System.out.println(elems1.isEmpty()); //Checking if stack is empty

        //List Stack

        Stack<Integer> elems2 = new ListStack<Integer>(20);

        for (int i = 20; i>=1; i--){
            elems2.push(i);
        }

        elems2.display(); //First Display

        elems2.reverse(); //Reversing stack

        elems2.display(); //Displaying reveresed stack

        System.out.println(elems2.peek()); // Peeking

        elems2.pop(); // Popping the first time

        elems2.pop(); // Popping the second time
        
        elems2.reverse(); //Second reverse

        System.out.println(elems2.size()); //Size of elems

        System.out.println(elems2.isFull()); // If its full

        System.out.println(elems2.isEmpty()); // If its empty

        elems2.display(); // Second display

        elems2.clear(); // Clear stack

        elems2.display(); // Third display

        System.out.println(elems2.isEmpty()); //Checking if stack is empty

        
        
    }
}