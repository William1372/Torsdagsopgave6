public class Main {

    public static void main(String[] args) {

        Cafe cafe = new Cafe();

        cafe.loadMenuData();

        System.out.println("\n Kaffemenuen byder på følgende drikkevarer: \n");

        for (String coffee : cafe.getCoffeeMenu()){

            System.out.println(coffee);

        }

    }

}
