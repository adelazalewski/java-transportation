package transport;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    private static List<AbstractVehical> filterVehicle(List<AbstractVehical> vehicles, CheckVehicle tester)
    //me need something that holds the place of an expression = thats an interface...
    {
        List<AbstractVehical> tempList = new ArrayList<>();

        //arrays for loops in java:
        for(AbstractVehical v : vehicles)
        //for each vehicle of type abstract vehicle in vehicles
        {
            if(tester.test(v))
            //if they pass the filter im gonna add them to the list
            {
                tempList.add(v);
            }
        }

        return tempList;
    }
    public static void main(String[] args)
    {
        System.out.println("Java day 2! Hi");

        System.out.println("\n\n*** Interface ***");
        Horse joe = new Horse("Joe");
        joe.eat(25);
        for (int i = 0; i<3; i++)
        {
            joe.move();
        }
        System.out.println("Joe " + joe.getFuelLevel());



        HorseFromVehical secretariat = new HorseFromVehical("Secretariat", 10);
    secretariat.addFuel(10);
    System.out.println("Secretariat " + secretariat.getfuelLevel());

    HorseFromVehical eclipse = new HorseFromVehical("Eclipse");
    eclipse.move(10);

    HorseFromVehical trigger = new HorseFromVehical("Trigger", 10);
    HorseFromVehical seattleSlew = new HorseFromVehical("Seattle Slew", 10);
    HorseFromVehical americanPharoah = new HorseFromVehical("American Pharoah", 10);

    Auto vw = new Auto(1, "Euro", 2000);
    Auto toyota = new Auto(10, "Tundra", 1998);
    Auto honda = new Auto(5, "Accord", 2003);

    vw.move();
    vw.move(5);
    System.out.println(vw.getfuelLevel());

    //ArrayList = size is not fixed 
    //ArrayList = single type elements int only String only etc.
    //arrays = you have to specify the size of it
    //<type>
    List<AbstractVehical> myList = new ArrayList<>();
    myList.add(secretariat);
    myList.add(vw);
    myList.add(eclipse);
    myList.add(trigger);
    myList.add(seattleSlew);
    myList.add(americanPharoah);
    myList.add(vw);
    myList.add(toyota);
    myList.add(honda);

    System.out.println(myList);

    System.out.println();
    System.out.println("\n*** Sort List ***");
    //Lambda expression
    myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase((v2.getName())));
    myList.forEach((v) -> System.out.println(v.getName()));

    //filtering
    System.out.println("\n\n*** List Negative Fuel Levels ***");
    List<AbstractVehical> filteredList = filterVehicle(myList, v -> v.getfuelLevel() < 0);
    filteredList.sort((v1, v2) -> v2.getfuelLevel() - v1.getfuelLevel());
    filteredList.forEach((v) -> System.out.println(v));

    System.out.println("\nHorse with positive fuel level");
    filteredList = filterVehicle(myList, v -> (v.getfuelLevel() > 0));
    // filteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
    filteredList.forEach((v) -> System.out.println(v));
    }
}