package pkg.exec1;

public class Main {
    public static void main(String[] args) {
        GetOption gi = new GetOption();
        BookHandler bh = new BookHandler();
        while (true) {
            int opt = gi.GetOptionOnce();
            if (4 == opt) {
                System.out.println("exit, byebye!");
                return;
            }

            bh.Handle(opt);
        }
    }
}
