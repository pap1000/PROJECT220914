import java.util.Scanner;

public class SuccessOrFail {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하시오: ");
        int score = scanner.nextInt(); //버퍼에서 정수값을 읽음
        //score가 80이상이라면 만족
        if (score >= 80){
            System.out.println("축하합니다! 합격입니다.");
        }

        //스캐너 종료
        scanner.close();
    }
}
