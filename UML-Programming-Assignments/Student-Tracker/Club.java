public class Club extends Extracurricular{

  Club(String aName, String aSupervisor){
    super(aName, aSupervisor);
  }

  public void displayInfo(){
    System.out.println("Club: " + getName());
    System.out.println("Supervisor: " + getSupervisor());
  }
}