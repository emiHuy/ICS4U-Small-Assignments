public class Sport extends Extracurricular{

  Sport(String aName, String aSupervisor){
    super(aName, aSupervisor);
  }
  
  public void displayInfo(){
    System.out.println("Sport: " + getName());
    System.out.println("Coach: " + getSupervisor());
  }
}