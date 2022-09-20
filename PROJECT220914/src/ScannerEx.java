import java.util.Scanner;

public class ScannerEx {
    public static void main(String args[]){
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하시오.");
        Scanner scanner = new Scanner(System.in);

        //버퍼에서 다음 문자열 읽기
        String name = scanner.next();
        System.out.println("이름은 "+ name + ", ");

        //버퍼에서 다음 문자열 읽기
        String city = scanner.next();
        System.out.println("도시는 " + city +", ");

        //버퍼에서 다음 정수 읽기
        int age = scanner.nextInt();
        System.out.print("나이는 "+age+"살, ");

        //버퍼에서 다음 실수 읽기
        double weight = scanner.nextDouble();
        System.out.println("체중은 " + weight + "kg, ");

        //버퍼에서 다음 논리값 읽기
        boolean single = scanner.nextBoolean();
        System.out.println("독신 여부는"+ single + "입니다.");

        //scanner 닫기
        scanner.close();
    }
}
