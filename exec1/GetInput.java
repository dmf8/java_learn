package pkg.exec1;
import java.util.Scanner;
import java.io.Console;

public class GetInput {
    int GetOption(){
        Scanner s=new Scanner(System.in);
        System.out.println("test get option");
        String str= s.nextLine();
        System.out.println(str);
        return 0;
    }
}
