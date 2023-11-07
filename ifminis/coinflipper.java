import java.util.Random;
public class coinflipper
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int result = random.nextInt(2);
        if (result == 0)
        {
            System.out.println("tails");
        }
        else
        {
            System.out.println("heads");
        }
    }
}
