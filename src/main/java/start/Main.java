package start;

import java.awt.*;
import java.net.URI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String link = "https://github.com/";

        Scanner sc = new Scanner(System.in);
        System.out.print("유저 이름 : ");
        String userName = sc.next();

        try {
            Desktop.getDesktop().browse(new URI(link+userName));
        } catch (Exception ignored) {}
    }
}
