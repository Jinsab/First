import java.util.Scanner;

public class DiagnosticEvaluation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 키보드로 입력한 정수가 19 이상이면 '성년', 아니면 '미성년'을 출력ㅎ는 프로그램을 if~else 문을 사용해 작성하시오.
        int years = in.nextInt();

        if(years >= 19)
        {
            System.out.println("성년");
        }
        else
        {
            System.out.println("미성년");
        }

        // 2. 키볻로 등수를 입력받아 1등이면 '아주 잘했습니다.', 2~3등이면 '잘했습니다', 4~6등이면 '보통입니다'
        // 그 외 등수이면 '노력해야겠습니다'고 출력하는 프로그램을 switch문을 사용해 작성하시오.

        int grade = in.nextInt();

        switch(grade)
        {
            case 1 : System.out.println("아주 잘했습니다.");
                break;

            case 2:
            case 3:System.out.println("잘했습니다.");
                break;

            case 4:
            case 5:
            case 6: System.out.println("보통입니다.");
                break;

            default: System.out.println("노력해야겠습니다.");
                break;
        }

        // 3. 키보드로 입력된 양의 정수 중에서 짝수만 덧셈해서 출력하는 코드를 do~while문을 사용해 작성하시오. 단, 입력된 정수가 양수가 아니라면 입력을 종료한다.

        int Result = 0;
        int Even = 0;

        do {
            Even = in.nextInt();

            if(Even%2 == 0)
            {
                Result = Result+Even;
            }
        } while(Even >= 0);

        System.out.println(Result);


        // 4. 다음 실행 결과를 출력하는 프로그램을 for문을 사용해 작성하시오. 별찍기 5까지

        for(int i=0; i<5; i++)
        {
            for(int j=0; j<i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // 5. 철수와 영희가 가위(s), 바위(r), 보(p) 게임을 한다. 다음 실행 결과와 같이 r, p, s 중 하나를 입력해 승자 또는 무승부를
        // 출력하는 프로그램을 작성하시오.

        System.out.print("철수 : ");
        String chul = in.next();
        System.out.print("영희 : ");
        String yung = in.next();

        // p = 112, r = 114, s = 115
        if (chul.equals("r")) // 철수 바위일때
        {
            if (yung.equals("r")) // 영희 바위
            {
                System.out.println("무승부!");
            }
            else if (yung.equals("s"))
            {
                System.out.println("철수, 승!");
            }
            else
            {
                System.out.println("영희, 승!");
            }
        }
        else if(chul.equals("s")) // 철수 가위일때
        {
            if (yung.equals("r")) // 영희 바위
            {
                System.out.println("영희, 승!");
            }
            else if (yung.equals("s"))
            {
                System.out.println("무승부!");
            }
            else
            {
                System.out.println("철수, 승!");
            }
        }
        else // 철수 보자기 일때
        {
            if (yung.equals("r")) // 영희 바위
            {
                System.out.println("철수, 승!");
            }
            else if (yung.equals("s"))
            {
                System.out.println("영희, 승!");
            }
            else
            {
                System.out.println("무승부!");
            }
        }

    }
}
