import java.util.Scanner;

public class EchoDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int gab = 0;

        String chul = "";
        String yung = "";

        input(chul, yung, in, gab);
    }

    public static void input(String c, String y, Scanner in, int gab) {
        in = new Scanner(System.in);
        System.out.print("철수 : ");
        c = in.next();
        System.out.print("영희 : ");
        y = in.next();

        if(c.equals(y))
        {
            gab = 1;
        }
        else if(c.equals("r"))
        {
            if(y.equals("p"))
            {
                gab = 2;
            }
            else
            {
                gab = 3;
            }
        }
        else if(c.equals("p"))
        {
            if(y.equals("s"))
            {
                gab = 2;
            }
            else
            {
                gab = 3;
            }
        }
        else
        {
            if(y.equals("r"))
            {
                gab = 2;
            }
            else
            {
                gab = 3;
            }
        }

        output(gab);
    }

    public static void output(int gab) {
        if(gab == 1)
        {
            System.out.println("무승부!");
        }
        else if(gab == 2)
        {
            System.out.println("영희, 승!");
        }
        else
        {
            System.out.println("철수, 승!");
        }

    }
}
