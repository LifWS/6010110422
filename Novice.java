import java.util.Scanner;
import java.util.Random;

public class Novice {

   public String NAME = "";
   public int LV = 1;
   public int HP = 500;
   public int SD = 200;
   public int ATK = 50;
   public int DEF = 60; // it's the panopl
   
    public void attMoster() {
        System.out.println("Moster was DEATED!!");
        Random  r = new Random();
        HP = HP - r.nextInt(100);
        SD = SD - r.nextInt(30);
        DEF = DEF - r.nextInt(20);

    }
    public void showStatus(){
        System.out.println("----------------------");
        System.out.println("Status ");
        System.out.println("Name :"+NAME);
        System.out.println("LV :"+LV);
        System.out.println("HP :"+HP);
        System.out.println("SD :"+SD);
        System.out.println("ATK :"+ATK);
        System.out.println("DEF :"+DEF);
        System.out.println("----------------------");
    }
    public void changClass(){
        System.out.println("----------------------");
        System.out.println("[1]Acholyte");
        System.out.println("[2]Magician");
        System.out.println("[3]Swordsman");
        System.out.println("----------------------");
        //System.out.println(HP);
    }
    public void Acholyte() {
        System.out.println("I am Acholyte");
        LV = LV +1;
        HP = HP + 100;
        SD = SD + 200;
        ATK = ATK + 100;
        DEF = DEF + 100;
    }
    public void Magician() {
        System.out.println("I am Magician");
        LV = LV +1;
        HP = HP + 100;
        SD = SD + 300;
        ATK = ATK + 80;
        DEF = DEF + 80;
    }
    public void Swordsman() {
        System.out.println("I am Swordsman");
        LV = LV +1;
        HP = HP + 150;
        SD = SD + 100;
        ATK = ATK + 250;
        DEF = DEF + 100;
    }
}