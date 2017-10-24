import java.util.Scanner;

public class PlayTowerofHanoi {
    public static void main(String[] args){
        System.out.println("How many disks would you like to play with? (Up to 6)");
        Scanner in;//scanner variable
        in = new Scanner(System.in);//scanner value
        int c=in.nextInt();//assigning the canner value to the int variable
        TowersofHanoi tow=new TowersofHanoi(c);//use the int variable to initialise the game
        tow.showTowerStates();//show the initial state
        System.out.println("You have a maximun of "+tow.lim+" moves to complete the game");//display nubmer of allowed moves
        int choice=0;//choice variable
        boolean win=false;
        while(choice!=1&&choice!=2){//until a valid choice is taken
            System.out.println("Would you like to play the game(1) or have the puzzle solved(2)?");
            Scanner ch;//scanner variable
            ch=new Scanner(System.in);//scanner value
            choice=ch.nextInt();//int value of scanner value
        }
        if (choice==1){//choie 1 allows the player to play
            while(!win&&tow.steps!=tow.lim){//while there are steps to make, and the game hasn't been won
                System.out.println("Which rod would you like to remove a disk from 0, 1, 2");
                Scanner a;//choosing a disk source through scanner method
                a=new Scanner(System.in);
                int ra=a.nextInt();
                System.out.println("Where would you like to put the disk");
                Scanner b;//choosing a destination disk from scanner method
                b=new Scanner(System.in);
                int rb=b.nextInt();
                tow.move(ra,rb);//move disk from a to b if possible
        }
        if (tow.rods[0].isEmpty()&&tow.rods[1].isEmpty()){
            System.out.println("\nYou have won!");//if the first 2 rods are empty then the game is won
        }
        else{System.out.println("\nYou have ran out of steps");}
        }//The other condition to end the loop is that the steps have ran out
        
        else{
        tow.solvegame(c);//choice 2 was made and the game is solved for the,
        }
        
    }
    
}
