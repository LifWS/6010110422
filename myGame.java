import java.util.Scanner;
import java.util.Random;

public class myGame {
    public static void main(String[] args) {
        Novice myChar = new Novice(); 
        Bag myBag = new Bag();

        System.out.println("----------------------");
        System.out.println("Welcome to [ WS GAME ] ");
        System.out.println("----------------------");
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your Charector: ");
        myChar.NAME = Sc.nextLine();
        myChar.showStatus();
        System.out.println("ATTACK MOSTER !!!");
        myChar.attMoster();
        myChar.showStatus();
        System.out.println("You get EXP :"+myBag.getExp(myBag.EXP));
        System.out.println("You get MONEY :"+myBag.getMoney(myBag.MONEY));
        myChar.changClass();
        Scanner scr = new Scanner(System.in);
        System.out.print("Pleas select class : ");
        int data = scr.nextInt();
        if (data == 1){
            myChar.Acholyte();
        }
        else if(data == 2){
            myChar.Magician();
        }
        else if(data == 3){
            myChar.Swordsman();
        }
        System.out.println("----------------------");
        System.out.println("Finished chang class");
        myChar.showStatus();
    }
}