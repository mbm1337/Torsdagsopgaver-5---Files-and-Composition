package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(4,10,6);
        Room room2 = new Room(7,30,8);
        Room room3 = new Room(3,6,2);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms,6,1,true);

        countLampsInBuilding(building);
        isNormal(building);




    }

    public static int countLampsInBuilding(Building building){
        ArrayList<Room> rooms = building.getRooms();
        int totalOfLamps = 0;


        for (Room room : rooms) {
           totalOfLamps = room.getNumberOfLamps() + totalOfLamps;
        }

        return totalOfLamps;
    }

    public static boolean isNormal(Building building){

        if(building.getNumberOfFloors()>building.getRooms().size()){
            return true;
        }else {
            System.out.println("This is an odd building");
            return false;
        }
    }


}
