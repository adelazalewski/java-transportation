package transport;

public class HorseFromVehical extends AbstractVehical {
    private String name;

    //constructor
    public HorseFromVehical(String name, int fuel)
    {
        //call the thing from the parent and cal;l the constructor from the parent
        super(fuel); //this.fuel=fuel
        this.name = name;
    }

    //another constructore
    public HorseFromVehical(String name)
    {
        //here is gonna call the default constructor from the parent abstract class
        //super(); fuel = 1 => the default constructor
        this.name=name;
    }
    //the abstract methods from the parent abstract class have to be used by the child class
    @Override
    public String getPath()
    {
        return "Grass";
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "HorseFromVehicle Name: " + name + "fuel: " + fuel;
    }    
}
