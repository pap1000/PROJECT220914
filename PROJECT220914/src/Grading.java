import java.util.Scanner;

public class Grading {
    public static void main(String[] args){
        char grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요(0~100): ");
        int score = scanner.nextInt();
        if(score >= 90) //score가 90이상이면 A
            grade = 'A';
        else if(score >= 80) //score가 80점 이상 90점 미만이면 B
            grade = 'B';
        else if(score >= 70) //score가 70점 이상 80점 미만이면 C
            grade = 'C';
        else if(score >= 60) //score가 60점 이상 70점 미만이면 D
            grade = 'D';
        else                 //score가 60점 미만이면 F
            grade = 'F';
        System.out.println("학점은 " + grade + "입니다.");

        scanner.close();
    }
}