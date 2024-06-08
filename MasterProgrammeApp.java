
public class MasterProgrammeApp
{
    public static void main (String [] args)
    {
      MasterProgramme coursework = new MasterProgramme ("Coursework", 2500.00 , 4);
      MasterProgramme research = new MasterProgramme ("Research", 1500.00 , 6);
      MasterProgramme mixedMode = new MasterProgramme ("Mixed mode" , 1900.00 , 5);
      
      System.out.println ("Coursework: \n" + coursework.toString() + "\n");
      System.out.println ("Research: \n" + research.toString () + "\n");
      System.out.println ("Mixed mode: \n" + mixedMode.toString () + "\n");
    }
}
