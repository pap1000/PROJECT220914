import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        //입력된 정수값을 시간, 분, 초 단위로 계산
        int time = scanner.nextInt();
        int second = time%60;
        int minute = (time/60) % 60;
        int hour = (time/60)/60;

        //입력받은 정수값에 해당하는 초를 시간, 분, 초 단위로 출력
        System.out.print(time + "초는 ");
        System.out.print(hour + "시간, ");
        System.out.print(minute + "분, ");
        System.out.print(second + "초입니다.");

        //스캐너 종료
        scanner.close();
    }
}
