import java.util.Scanner;

public class Nestdlf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요(0~100): ");
        int score = scanner.nextInt();

        System.out.print("학년을 입력하세요(1~4): ");
        int year = scanner.nextInt();

        //60점이상일 경우
        if(score >= 60){
            //4학년이 아니면 합격
            if(year != 4)
                System.out.println("합격!");
            //4학년일 경우 70점이상이면 합격
            else if(score >= 70)
                System.out.println("합격");
            //4학년이 70점미만이면 불합격
            else
                System.out.println("불합격!");
        }
        //60점미만이면 불합격
        else
            System.out.println("불합격!");
        scanner.close();
    }
}
