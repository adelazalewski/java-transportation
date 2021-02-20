package transport;

//class a blueprint for objects
//abstract class = a blueprint for classes
//every class inherits from abstract vehical class and they have to do at least what the parent abstract class can do
//abstarct class provides uniformity among classes
abstract class AbstractVehical {
    //field
    protected int fuel;
    //protected = the parent and the children know about fuel
    //private only the parent class knows about it

    //default constructor = no params
    public AbstractVehical()
    {
        fuel = 1;

    }
//another constructor which is fine but they have to have diffrent params
    public AbstractVehical(int fuel)
    {
        this.fuel = fuel;
    }

    //methods
    abstract String getPath();
    abstract String getName();
    //our childern can get path and name what ever they do cause the children deside what they do/children implement them

    void move()
    {
        fuel--;
    }

    void move(int steps)
    {
        fuel=fuel - steps;
    }

    int getfuelLevel()
    {
        return fuel;
    }

    void addFuel(int i)
    {
        fuel = fuel +i;
    }
}
