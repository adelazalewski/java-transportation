package transport;

public class Auto extends AbstractVehical {
    private String model;
    private int year;

    public Auto(int fuel, String model, int year)
    {
        super(fuel); //parent sets fuel for us when  we use super
        this.model = model;
        this.year = year;
    }

    @Override
    public String getPath(){
        return "Road";
    }
    @Override
    public String getName(){
        return model;
    }

    public int getYear()
    {
        return year;

    }

    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "Auto Model: " + model + "year: " + "fuel: " + fuel;
    }
}
