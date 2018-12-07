package tam.controller;

import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) {
//        System.out.println("1aaaaa" + System.lineSeparator() + "bbbbb");
//        System.out.println("2aaaaa%nbbbbb");
//        System.out.println("3aaaaa\nbbbbb");
//        System.out.println("4aaaaa\r\nbbbbb");
//        System.out.printf("I %n am %n a %n boy");
        Double doubl = 2.6;
        String pattern = "#,##0";
        DecimalFormat format = new DecimalFormat(pattern);
        String a = format.format(doubl);
        System.out.println(doubl);
        System.out.println(a);

    }
}
