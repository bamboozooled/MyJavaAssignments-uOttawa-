
import static java.lang.Math.pow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 */
public class TowersofHanoi {
    int n;//Number of Discks
    int lim;//Limit of steps
    int steps;//Number of steps
    ArrayStack<Integer>[] rods = new ArrayStack[3];//The 3 rods
    
    public TowersofHanoi(int c){
    this.n=c;//Setting the number of disks
    steps=0;//Start with 0 steps
    lim=(int)(pow(2,c)-1);//Calculating the limit of steps
    rods[0]=new ArrayStack(n);//initializing the size of the 3 rods
    rods[1]=new ArrayStack(n);
    rods[2]=new ArrayStack(n);
    for (int i=n;i>0;i--){//Filling the first rod, largest to smallest
        rods[0].push(i);
    }
    }
    
    boolean legalMove(int a, int b){
        if(rods[a].isEmpty()){//If rod a is empty, there cannot be a move
            return false;
        }
        if(!rods[a].isEmpty()){
        int x=rods[a].peek();//take value or rod a
        
        if(!rods[b].isEmpty()){//if there is a value of rod b
                               //take it and compare to a
        int y=rods[b].peek();
        return y>x;
        }}
        return rods[b].isEmpty();//a is not empty, so b is empty and any disk can move
    }
    boolean move(int a, int b){//moving a disk from rod a to rod b
        boolean flag =legalMove(a,b);
        if(flag==true){//if the move is legal
            System.out.println("\nDisk moved from Rod "+a+" to Rod "+b);
            rods[b].push(rods[a].pop());//switching placement of disk
            steps++;//counting the steps
            showTowerStates();//displaying the current state of the towers
        }else{System.out.println("\nThat move is not legal");}//else the move is not legal
        return flag;//return whether the move happened or not
    }
    boolean move(int m, int a, int b, int c){
        boolean flag=true;
        solvegame(m);//solving for the given number of disks
        
        return flag;
    }
    void showTowerStates(){//used for showing the stacking order of the rods and disks
        ArrayStack<Integer> temp=new ArrayStack(this.n);
        System.out.println("Rod 0: ");
        while(!rods[0].isEmpty()){//keep popping until the original stack is empty
        temp.push(rods[0].pop());//reversing the order of original stack
        }
        while (!temp.isEmpty()){//keep popping until the temp stack is empty
            rods[0].push(temp.pop());
            System.out.print(rods[0].peek()+" ");//displaying the stack order
        }
        System.out.println("\nRod 1: ");//repeat for all rods
        while(!rods[1].isEmpty()){
        temp.push(rods[1].pop());
        }
        while (!temp.isEmpty()){
            rods[1].push(temp.pop());
            System.out.print(rods[1].peek()+" ");
        }
        System.out.println("\nRod 2: ");
        while(!rods[2].isEmpty()){
        temp.push(rods[2].pop());
        }
        while (!temp.isEmpty()){
            rods[2].push(temp.pop());
            System.out.print(rods[2].peek()+" \n");
        }
        
    }
    void solvegame(int n){//Solving the game for given number of disks
        int gamer=0;//modulus 3 counter
        boolean game=false;//boolean return value of each move
        int b=0;//3 cases comparision with modulus 3 counter
        while(!(rods[0].isEmpty()&&rods[1].isEmpty())){//Program will run until first two rods are empty
        if (n%2==0){//if there are an even number of disks to move
           
               
               switch (b){//switch for 3 cylce moves
               
                case (0)://first move
                    game=move(0,1);//try first move
                    if (!game){//if the first order didn't work, do other order
                        game=move(1,0);
                    }
                   //if(!move(0,1)){move(1,0);}
                   System.out.print("case1\n");
                case (1):
                    game=move(0,2);
                    if (!game){
                        game=move(2,0);
                    }
                    //if(!move(0,2)){move(2,0);}
                    System.out.print("case2\n");
                case(2):                    
                    game=move(1,2);
                    if (!game){
                        game=move(2,1);
                    }
                    //if(!move(1,2)){move(2,1);}
                    System.out.print("case3\n");
               }
               gamer++;
               b=gamer%3;
               //showTowerStates();
           } 
        
        else{//there are an odd number of disks and the attempt order is slightly different
           
               
               switch (b){//the same moves are applied to different order of rods
               
                case (0):
                   if(!move(0,2)){move(2,0);}
                   System.out.print("case1\n");
                case (1):
                    if(!move(0,1)){move(1,0);}
                    System.out.print("case2\n");
                case(2):
                    if(!move(1,2)){move(2,1);}
                    System.out.print("case3\n");
               }
               gamer++;
               b=gamer%3;
           } 
        }
        
    }
    void solvecurrent(){
        solvegame(n);//solving the current can be repeated by the solvegame method
    }
    
}
