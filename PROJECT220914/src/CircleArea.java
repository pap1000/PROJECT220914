public class CircleArea {
    public static void main(String[] args){
        //원주율을 상수로 선언, 반지름과 원의 면적을 변수로 선언
        final double PI = 3.14;
        double radius = 10.0;
        double circleArea = radius*radius*PI;

        //입력된 변수와 문자열을 합하여 출력
        System.out.println("원의 면적 = "+ circleArea);
    }
}
