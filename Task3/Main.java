import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();

        Room room1 = new Room(1,3);
        Room room2 = new Room(4,4);
        Room room3 = new Room(2,3);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(rooms, 3);

        System.out.println("Total number of lamps in the building: "+countLampsInBuilding(building1));
        System.out.println("Total number of windows in the building: "+countWindowsInBuilding(building1));
        System.out.println("The building is normal: "+isNormal(building1));

    }

    public static int countLampsInBuilding(Building building){

        int numberOfLamps = 0;

        for (Room room : building.getRooms()){

            numberOfLamps += room.getNumberOfLamps();

        }

        return numberOfLamps;

    }

    public static int countWindowsInBuilding(Building building){

        int numberOfWindows = 0;

        for(Room room : building.getRooms()){

            numberOfWindows += room.getNumberOfWindows();

        }

        return numberOfWindows;

    }

    // Er det ikke mere normalt hvis bygningen har færre etager end rum? :D
    public static boolean isNormal(Building building){

        return building.getNumberOfFloors() >= building.getRooms().size();

    }

}
