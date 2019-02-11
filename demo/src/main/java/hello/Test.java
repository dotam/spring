package hello;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Boolean a = true;
        System.out.println(Boolean.TRUE.equals(a));
        for (int i = 0; i < 1000; i++) {
            System.out.println(new Random().nextInt(3));
        }
    }
}
