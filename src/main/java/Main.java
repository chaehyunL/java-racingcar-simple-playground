import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car A = new Car("A");
        System.out.println("자동차 이름:"+A.name);
        System.out.println("위치:"+A.position);
        A.move();
        System.out.println("위치"+A.position);
    }

}