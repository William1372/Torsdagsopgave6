import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private ArrayList<String> coffeeMenu;

    public Cafe(){

        this.coffeeMenu = new ArrayList<>();

    }

    public ArrayList<String> getCoffeeMenu(){

        return coffeeMenu;

    }

    public void loadMenuData(){

        try {

            File file = new File("coffees.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){

                coffeeMenu.add(scanner.nextLine());

            }

        }catch(FileNotFoundException e){

            System.out.println("The file is not available and/or is misplaced on your device.");

        }

    }

}
