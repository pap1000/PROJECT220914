public class TypeConversion {
    public static void main(String[] args){
        byte a = 127;
        int i = 100;

        System.out.println(a+i);
        System.out.println(10/4);
        //자동타입변환
        System.out.println(10.0/4);
        //강제타입변환
        System.out.println((char)0x12340041);
        System.out.println((byte)(a+i));
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.print((int)2.9+(int)1.8);
    }
}
