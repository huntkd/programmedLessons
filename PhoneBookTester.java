import java.util.Scanner;

class PhoneEntry
{
  private String name;    // name of a person
  private String phone;   // their phone number

  public PhoneEntry( String n, String p )
  {
    name = n; phone = p;
  }
  
  public String getName()  {return name;}
  public String getPhone() {return phone;}
}

class PhoneBook
{ 
  private PhoneEntry[] phoneBook; 

  public PhoneBook()    // constructor
  {
    phoneBook = new PhoneEntry[ 5 ] ;

    phoneBook[0] = new PhoneEntry( "James Barclay", "(418) 665-1223" );
    phoneBook[1] = new PhoneEntry( "Grace Dunbar", "(860) 399-3044" );
    phoneBook[2] = new PhoneEntry( "Paul Kratides", "(815) 439-9271" );
    phoneBook[3] = new PhoneEntry( "Violet Smith", "(312) 223-1937" );
    phoneBook[4] = new PhoneEntry( "John Wood", "(913) 883-2874" );

  }

  public PhoneEntry search( String targetName )  
  {
    for ( int j=0; j < phoneBook.length; j++ )
    {
      if ( phoneBook[ j] != null && phoneBook[ j ].getName().equals( targetName ) )
        return phoneBook[ j ];
    }

    return null;
  }
}

public class PhoneBookTester
{
  public static void main ( String[] args )
  {
    System.out.println("Name?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    PhoneBook pb = new PhoneBook();  
  
    // search for "Violet Smith"
    PhoneEntry entry = pb.search( name ); 

    if ( entry != null )
      System.out.println( entry.getName() + ": " + entry.getPhone() );
    else
      System.out.println("Name not found" );

  }
}
