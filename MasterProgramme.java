public class MasterProgramme
{
  //data members
  private String modeStudy;
  private double TuitionFee;
  private int NumbSem;
  
  //normal constructor
  public MasterProgramme ( String MS, double TF, int NS )
  {
      this.setModeStudy (MS);
      this.setTuitionFee (TF);
      this.setNumbSem (NS);
      
  }
  
  //Setter@mutator
  public void setModeStudy(String MS) { this.modeStudy=MS;}
  public void setTuitionFee ( double TF) { this.TuitionFee=TF;}
  public void setNumbSem ( int NS ) {this.NumbSem=NS;}
  
  //getter@accessor
  public String getModeStudy () {return this.modeStudy;}
  public double getTuitionFee() { return this.TuitionFee;}
  public int getNumbSem (){return this.NumbSem;}
  
  //processor
  public double calculateTotalFee()
  {
      double totalFee = TuitionFee * NumbSem;
      totalFee += 50.00 * NumbSem;
      totalFee += 25.00 * NumbSem;
      return totalFee;
  }
  
  //printer
  public String toString ()
  {
      return "Mode of Study: " + modeStudy + "\n" + "Tuition Fee (RM): " + TuitionFee + "\n" + "Number of Semesters: " + NumbSem + "\n" + "Total Fee (RM) : " + calculateTotalFee();
  }
  
  
}
