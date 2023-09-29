import java.util.ArrayList;
import java.util.List;
//this is the class created
public class Add {
    static List<Contact> contacts = new ArrayList<>();
    Add(){}
    public static void add(){
    Contact contact = new Contact("Redowan Tanvir Shifat","01845008660");
    Contact contact1 = new Contact("Asadullah Imran","01633356249");
    Contact contact2 = new Contact("Tawfik Rahman","01962184533");
    //now add the numbers into the array list;
        contacts.add(contact);
        contacts.add(contact1);
        contacts.add(contact2);
    }
}
