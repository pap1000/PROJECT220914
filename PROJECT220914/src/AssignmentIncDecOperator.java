public class AssignmentIncDecOperator {
    public static void main(String [] args){
        int a = 3, b = 3, c = 3;

        //대입 연산자 사례
        a += 3; // a = a+3
        b *= 3; // b = b*3
        c %= 2; // c = c%2
        System.out.println("a = "+ a + ", b = " + b + ", c =" + c);

        int d = 3;
        //증감 연산자 사례
        a = d++;    //a = 3, d = 4 d를 증가시키고 증가되기 전의 값 반환
        System.out.println("a = " + a + ", d = " + d);
        a = ++d;    //a = 5, d = 5 d를 증가시키고 1이 증가된 값을 반환
        System.out.println("a = " + a + ", d = " + d);
        a = d--;    //a = 5, d = 4 d를 감소키기고 감소되기 전의 값 반환
        System.out.println("a = " + a + ", d = " + d);
        a = --d;    //d = 3, a = 3 d를 감소시키고 1이 감소된 값을 반환
        System.out.println("a = " + a + ", d = " + d);
    }
}
