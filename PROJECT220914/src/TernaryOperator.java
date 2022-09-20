public class TernaryOperator {
    public static void main(String[] args){
        int a = 3, b = 5;

        //a > b가 true이면 a-b를, false이면 b-a
        System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));
    }
}
