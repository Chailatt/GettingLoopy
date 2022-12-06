public class Main
{

    public static void main(String[] args)
    {
        //Part A #1
        int loop = 0;
        for (loop = 0; loop <=30; loop++)
        {
            System.out.printf("%3d", loop);
        }
        System.out.println("");

        // Part A #2
        for (loop = 30; loop >=0; loop--)
        {
            System.out.printf("%3d", loop);
        }
        System.out.println("");

        //Part A #3
        for (loop = 0; loop <=18; loop = loop + 3)
        {
            System.out.print(loop);
        }
        System.out.println("");

        //Part A #4
        for (loop = 10; loop >= 0; loop = loop - 2)
        {
            System.out.println(loop);
        }

        //Part B #5
        final int ROW = 5;
        final int COL = 5;

        for (int row = 0; row <= ROW; row++)
        {
            for (int col = 0; col <= row; col++)
            {
                System.out.printf("*");
            }
            System.out.println("");
        }

        //Part B #6

        for (int row = 0; row <= ROW; row++)
        {
            for (int col = row; col <= COL; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");

        //Part B #7

        for (int row = 0; row <= ROW; row++)
        {
            for (int col = 0; col <= COL; col++)
            {
                System.out.print("*");
            }
                System.out.println("");
        }

    }
}