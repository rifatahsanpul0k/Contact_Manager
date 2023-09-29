//This is the class to show the menu
import java.util.Scanner;
public class Menu {
    public static void showMenu (){
        System.out.println(
                "1.Add New Contact\n2.Edit Existing Contact\n3.Delete a Contact\n");
    }
    public static byte selection1() {
        Scanner selection1 = new Scanner(System.in);
        return selection1.nextByte();//Input taken;
    }
}
