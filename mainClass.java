import java.util.ArrayList;
import java.util.Scanner;
public class mainClass {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Plz enter Name : ");
        String name = input.nextLine();
        System.out.println("Plz enter Address : ");
        String address = input.nextLine();
        System.out.println("Plz enter ContactNo : ");
        String contact = input.nextLine();


        ArrayList<Data> Contacts = new ArrayList<Data>();
        
        Data objt = new Data(name, address, contact);
        Contacts.add(objt);
        
    }
}
private class Data {

    private String n;
    private String a;
    private String c;


    public Data(String n, String a, String c){

        this.n = name; 
        this.a = address;
        this.c = cell; 
    }
    public void printData(name, address, contact){

        System.out.println("Name\tAddress\tContactNo");
        System.out.println(name + "\t" + address + "\t" + cell);
    }
}
