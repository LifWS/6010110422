import java.util.Scanner;
import java.util.Random;

public class Bag{
    public int MONEY = 0;
    public int EXP = 0;

    public int getMoney(int money){
        Random r = new Random();
        return r.nextInt(200)+50;  // 50-250
    }

    public int getExp(int exp){
        Random r = new Random();
        return r.nextInt(100)+50;
        }
        
}
