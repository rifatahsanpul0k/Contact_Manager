public class Main {
    public static void main(String[] args) {
        //add 3 contacts;
        Add.add();
        Menu.showMenu();//show menu and take input
        byte selection = Menu.selection1();//select one option
        Choice.choice(selection);//choice and do what you want

    }
}