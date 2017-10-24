import javafx.scene.Parent;

public class MyCalculator{
    static final String paranthesis = "(";
    static final String curlyB = "{";
    static final String squareB = "[";
    static final String angleB = "<";
    static final String paranthesisC = ")";
    static final String curlyBC = "}";
    static final String squareBC = "]";
    static final String angleBC = ">";
    static Stack<String> elems;
    static Stack<String> infpo;
    static String[] theEl;
    static String postf = "";
    public static boolean isBalanced(String expression){
        elems = new ArrayStack<String>(expression.length());
        theEl = new String[expression.length()];
        boolean rts=true;
        for (int i = 0; i<expression.length(); i++){
            theEl[i] = String.valueOf(expression.charAt(i));
        }

        for (int i = 0; i<theEl.length; i++){
            if (theEl[i] == paranthesis){
                elems.push(paranthesisC);
            }

            else if(theEl[i] == curlyB){
                elems.push(curlyBC);
            }

            else if(theEl[i] == squareB){
                elems.push(squareBC);
            }

            else if(theEl[i] == angleB){
                elems.push(angleBC);
            }

            if (theEl[i] == paranthesisC){
                if (elems.peek() == paranthesisC){
                    elems.pop();
                }

                else if(elems.peek()!=angleBC||elems.isEmpty()){
                    rts = false;
                }
            }

            else if(theEl[i] == curlyBC){
                if (elems.peek() == curlyBC){
                    elems.pop();
                }

                else if(elems.peek()!= angleBC || elems.isEmpty()){
                    rts = false;
                }
            }

            else if(theEl[i] == squareBC){
                if (elems.peek()==squareBC){
                    elems.pop();
                }

                else if(elems.peek() != angleBC || elems.isEmpty()){
                    rts = false;
                }
            }
            else if(theEl[i] == angleBC){
                if (elems.peek()==angleBC){
                    elems.pop();
                }

                else if (elems.peek() != angleBC || elems.isEmpty()){
                    rts = false;
                }
            }
        }

        return rts;
    }

    public static String infixToPostfix(String infix){
        int save = 0;
        int starting = 0;
        int ending = 0;
        int v = 0;
        String out = "";
        int location = 0;
        String div = "/";
        String mul = "*";
        String sub = "-";
        String add = "+";
       
       String posfix = "";
        String ops = "";
        String hold = "";
        String s;
        boolean br = false;
        int brCount = 0;
        for(int i =0; i<infix.length();i++){
            s = String.valueOf(infix.charAt(i));

            if(s.equals(div) || s.equals(mul) || s.equals(sub) || s.equals(add)){
                if(brCount==1){
                    hold = s;
                }
                else{
                    ops += s;
                }
                
            }
            else if(s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9")){
                posfix += s;
            }
            else {
                brCount++;
                if(brCount == 2){
                    posfix += hold;
                    hold = "";
                    brCount=0;
                }
            }
        }

        postf = posfix+ops;

        return posfix+ops;
    }

    public static void evaluate(String postfix){
        double left = 0.0;
        double right = 0.0;
        double answer = 0.0;
        double out = 0.0;
        String div = "/";
        String mul = "*";
        String sub = "-";
        String add = "+";
        Stack<String> theStack = new ArrayStack<String>(postfix.length());
        String[] theArray = new String[postfix.length()];

        for (int i = 0; i<postfix.length(); i++){
            theArray[i] = String.valueOf(postfix.charAt(i));
        }

        for (int i = 0; i<theArray.length; i++){
            if (!(theArray[i].equals(div)) && !(theArray[i].equals(mul)) && !(theArray[i].equals(sub)) && !(theArray[i].equals(add))){
                theStack.push(theArray[i]);
            }

            else{
                right = Double.parseDouble(theStack.pop());
                left = Double.parseDouble(theStack.pop());

                if(theArray[i].equals(div)){
                    answer = left/right;
                    theStack.push(Double.toString(answer));
                } 
                else if(theArray[i].equals(mul)){
                    answer = left*right;
                    theStack.push(Double.toString(answer));
                }
                else if(theArray[i].equals(add)){
                    answer = left+right;
                    theStack.push(Double.toString(answer));
                }
                else if(theArray[i].equals(sub)){
                    answer = left-right;
                    theStack.push(Double.toString(answer));
                }
            }
        }

        System.out.println(answer);
    }

}