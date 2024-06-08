

public class Butterfly2
{
    int modelYear;
    String modelName;
    
    public Butterfly2 (int year, String name)
    {
        modelYear = year;
        modelName = name;
    }
    
    public static void Butterfly2(String [] args)
    {
        Butterfly2 myCar = new Butterfly2 ( 2020, "Mini Cooper");
        System.out.println (myCar.modelYear + " " + myCar.modelName);
        
    }
}
