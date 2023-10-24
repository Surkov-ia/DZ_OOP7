package Controller;

import java.util.Scanner;

public class ConsoleDataCreator implements Creator {
    public ConsoleDataCreator() {}

    Scanner in = new Scanner(System.in);
    @Override
    public String getData() {
        return in.next();
    }
}

