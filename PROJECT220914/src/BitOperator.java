public class BitOperator {
    public static void main(String[] args){
        short a = (short)0x55ff;
        short b = (short)0x00ff;

        //비트 논리 연산
        System.out.println("[비트 연산 결과]");
        System.out.printf("%04x\n", (short)(a & b)); //비트 AND연산
        System.out.printf("%04x\n", (short)(a | b)); //비트 OR연산
        System.out.printf("%04x\n", (short)(a ^ b)); //비트 XOR연산
        System.out.printf("%04x\n", (short)(~a));    //비트 NOT연산

        byte c = 20; //0x14 10100
        byte d = -8; //0xf8

        //비트 시프트 연산
        System.out.println("[시프트 연산 결과]");
        System.out.println(c << 2); //c를 2비트만큼 왼쪽으로 시프트 연산
        System.out.println(c >> 2); //c를 2비트만큼 오른쪽으로 시프트 연산, 최상위 비트를 0으로 채움
        System.out.println(d >> 2); //d를 2비트만큼 오른쪽으로 시프트 연산, 최상위 비트를 1로 채움(음수이기 때문)
        System.out.printf("%x\n", (d >>> 2)); // d를 2비트만큼 오른쪽으로 시프트 연산, 최상위 비트를 0으로 채움
    }
}
