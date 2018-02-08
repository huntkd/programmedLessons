import java.util.Scanner;

class PhoneEntry
{ 
  private String lastName;
  private String firstName;
  private String phone;   // their phone number

  public PhoneEntry( String f, String l, String p )
  {
    firstName = f; lastName = l; phone = p;
  }

  public String getName()       {return firstName + " " + lastName;}
  public String getLastName()  {return lastName;}
  public String getFirstName()  {return firstName;}
  public String getPhone() {return phone;}

  public void setFirstName(String newFirst)  {firstName = newFirst;}
  public void setLastName(String newLast)   {lastName = newLast;}
  public void setNumber(String newNum)    {phone = newNum;}
}

class PhoneBook
{ 
  private PhoneEntry[] phoneBook; 

  public PhoneBook()    // constructor
  {
    phoneBook = new PhoneEntry[ 7 ] ;

    phoneBook[0] = new PhoneEntry( "James", "Barclay", "(418) 665-1223" );
    phoneBook[1] = new PhoneEntry( "Grace", "Dunbar", "(860) 399-3044" );
    phoneBook[2] = new PhoneEntry( "Paul", "Kratides", "(815) 439-9271" );
    phoneBook[3] = new PhoneEntry( "Violet", "Smith", "(312) 223-1937" );
    phoneBook[4] = new PhoneEntry( "John", "Wood", "(913) 883-2874" );
    phoneBook[5] = new PhoneEntry( "Mary", "Smith", "(311) 222-3737" );

  }

  public void deleteNumber(String targetName) {
    int index = 0;
    for ( int j=0; j < phoneBook.length; j++ ) {
        if ( phoneBook[ j] != null && phoneBook[ j ].getName().toLowerCase().equals( targetName.toLowerCase() ) ) {
          index = j;
        }
    }
    System.out.println(phoneBook[index]);
    phoneBook[index] = null;
    System.out.println(phoneBook[index]);
  }

  public void addNumber(String firstName, String lastName, String number) {
    phoneBook[6] = new PhoneEntry(firstName, lastName, number);
    System.out.println(phoneBook[6].getName());
  }

  public PhoneEntry search(String targetName )  {
    for ( int j=0; j < phoneBook.length; j++ ) {
        if ( phoneBook[ j] != null && phoneBook[ j ].getName().toLowerCase().equals( targetName.toLowerCase() ) ) {
          return phoneBook[ j ];
        }
      }
      return null;
    }

  public PhoneEntry[] search(String targetLastName, String targetFirstName) {
    PhoneEntry[] entries = new PhoneEntry[phoneBook.length-1];
    for (int j=0; j < phoneBook.length; j++) {
      if ( phoneBook[j] != null) {
        if (phoneBook[ j ].getLastName().toLowerCase().equals( targetLastName.toLowerCase() ) ) {
           entries[j] = phoneBook[ j ];
         }
        }
         
    }
    if (entries.length > 0) {
      return entries;
    }
    
    return null;
  }

}

public class PhoneBookTester
{
  public static void main ( String[] args )
  {
    PhoneBook pb = new PhoneBook();  
    PhoneEntry[] entries = new PhoneEntry[7];
    PhoneEntry entry = new PhoneEntry("", "", "");
    boolean completed = false;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Search (1), Add (2), or Delete (3)?");
    String input = scanner.nextLine();

    System.out.println("Last Name?");
    String lastNameInput = scanner.nextLine();

    System.out.println("First Name?");
    String firstNameInput = scanner.nextLine();
    String combinedName = firstNameInput + " " + lastNameInput;


      if (input.equals("1")) {
        if ("".equals(firstNameInput)) {
         entries = pb.search(lastNameInput, firstNameInput);
         completed = true; 
        } else {   
          entry = pb.search(combinedName); 
        }
        if (completed) {
          for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null) {
            System.out.println(entries[i].getName() + ": "+ entries[i].getPhone());
            completed = true; 
            } 
          }
        } else {
          if (entry != null){
            System.out.println("The number is: " + entry.getPhone());
          } else {
            System.out.println("Name not found" );
          }
        } 
      } else if (input.equals("2")) {
        System.out.println("Number?");
        String numberInput = scanner.nextLine();
        pb.addNumber(firstNameInput, lastNameInput, numberInput);
        System.out.println("Number Added.");

      } else if (input.equals("3")) {
        pb.deleteNumber(combinedName);
        System.out.println("Number Deleted.");

        }

  }
}
