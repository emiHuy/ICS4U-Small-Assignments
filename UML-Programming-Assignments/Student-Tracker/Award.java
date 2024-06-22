public class Award{
  private String title;
  private String description;

  Award(String aTitle, String aDescription){
    title = aTitle;
    description = aDescription;
  }

  public String getTitle(){
    return title;
  }

  public String getDescription(){
    return description;
  }

  public void displayInfo(){
    System.out.println("Award: " + getTitle());
    System.out.println("Description: " + getDescription());
  }
}