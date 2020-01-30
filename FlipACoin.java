// zybooks requires the seed to be 2 in order for automatic testing
import java.util.Scanner;
import java.util.Random;

public class FlipACoin {
    public static String headsOrTails(Random ran)
    {
        int num;
        num = ran.nextInt(2);
        if (num == 0)
            return "heads";
        else
            return "tails";
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2); // Unique seed
        int times;

        times = scnr.nextInt();
        for(int i = 0; i<times;i++)
        {
            System.out.println(headsOrTails(rand));
        }
    }
}
