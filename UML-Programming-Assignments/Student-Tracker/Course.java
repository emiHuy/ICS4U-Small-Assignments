public class Course{
  private String courseCode;
  private String name;
  private String teacher;

  Course(String aCode, String aName, String aTeacher){
    courseCode = aCode;
    name = aName;
    teacher = aTeacher;
  }

  public String getCourseCode(){
    return courseCode;
  }

  public String getName(){
    return name;
  }
  
  public String getTeacher(){
    return teacher;
  }

  public void displayInfo(){
    System.out.println("Course code: " + getCourseCode());
    System.out.println("Course name: " + getName());
    System.out.println("Teacher: " + getTeacher());
  }
}