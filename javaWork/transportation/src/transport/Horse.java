package transport;

public class Horse implements Animal, Vehicle {
//FIELDS
    private int fuel = 0;
    private String name;

    //constructor
    public Horse(String name)
    {
        this.name = name;
    }

public String getName()
{
    return name;
}

    //method headers from animal
    @Override
    public void move()
    {
        fuel = fuel -1;
    }
    @Override
    public void eat(int i)
    {
        fuel = fuel + i;
    }
    @Override
    public String speak()
    {
        return "Neigh";
    }

    //headers from vehical
    @Override
    public String getPath()
    {
        return "Grass";
    }
    //void move();
    @Override
    public int getFuelLevel()
    {
        return fuel;
    }
    @Override
    public void addFuel(int i)
    {
        eat(i);
    }
}
