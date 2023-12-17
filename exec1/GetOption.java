package pkg.exec1;

import java.util.Scanner;

public class GetOption {

    GetOption() {
        this.s = new Scanner(System.in);
    }

    int GetOptionOnce() {
        System.out.println("------book store--------");
        System.out.println("1. show");
        System.out.println("2. insert");
        System.out.println("3. delete");
        System.out.println("4. exit");
        int opt = 0;
        while (true) {
            opt = GetOption();
            if (opt != 0)
                break;
            else
                System.out.println("invalid option, try again");
        }
        return opt;
    }

    private int GetOption() {
        int opt = 0;
        try {
            opt = s.nextInt();
            if (opt >= 1 && opt <= 4)
                return opt;
            else
                return 0;

        } catch (Exception ex) {
            System.out.println("invalid option, try again");
            if (s.hasNextLine())
                s.nextLine();
            return 0;
        }
    }

    private Scanner s;
}
