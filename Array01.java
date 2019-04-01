import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] scores = new int[5];
        int result = 0;

        for(int i=0; i<scores.length; i++)
        {
            scores[i] = in.nextInt();
        }

        for(int i=0; i<scores.length; i++)
        {
            result += scores[i];
        }

        System.out.println(result/scores.length);

    }
}
