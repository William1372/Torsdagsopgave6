public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 0;

    public Customer(String firstName, String lastName, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;

        this.id = counter++;

    }

    @Override
    public String toString(){

        return "Navn: "+firstName+" "+lastName+".\n"+"Brugernavn: "+username+".\n"+"ID: "+id+".";

    }

    public String getFirstName(){

        return firstName;

    }

    public String getLastName(){

        return lastName;

    }

    public String getUsername(){

        return username;

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public void setLastName(String lastName){

        this.lastName = lastName;

    }

    public void setUsername(String username){

        this.username = username;

    }

    public void setId(int id){

        this.id = id;

    }
}
