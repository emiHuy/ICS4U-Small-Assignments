import java.util.ArrayList;

public class Student{
  private ArrayList<Course> courseList = new ArrayList<Course>();
  private ArrayList<Award> awardsList = new ArrayList<Award>();
  private ArrayList<Extracurricular> extracurricularList = new ArrayList<Extracurricular>();
  private ArrayList<Double> courseAverages = new ArrayList<Double>();
  
  private int studentID;
  private String name;
  private int grade;

  Student(int id, String aName, int aGrade){
    studentID = id;
    name = aName;
    grade = aGrade;  
  }

  public int getStudentID(){
    return studentID;
  }
  
  public String getName(){
    return name;
  }

  public int getGrade(){
    return grade;
  }
  
  // Add student data
  public void addCourse(Course course){
    courseList.add(course);
    courseAverages.add(0.0);
  }
  
  public void addAward(Award award){
    awardsList.add(award);
  }

  public void addExtracurricular(Extracurricular activity){
      extracurricularList.add(activity);
  }

  // Set course marks
  public void setCourseMark(String courseCode, double mark){
    for(int x = 0; x < courseList.size(); x++){
      if(courseList.get(x).getCourseCode().equals(courseCode)){
        courseAverages.set(x, mark);
        return;
      }
    }
  }

  // Output information
  public void outputStudentInfo(){
    System.out.println("---STUDENT INFO---");
    System.out.println("Student: " + getName());
    System.out.println("ID: " + getStudentID());
    System.out.println("Grade: " + getGrade());
    System.out.println("Overall Average: " + calculateOverallAvg() + "\n\n");
  }

  public void outputCourses(){
    System.out.println("-----COURSES-----");
    for(Course course : courseList){
      course.displayInfo();
      System.out.println("Mark: " + (int)(courseAverages.get(courseList.indexOf(course))+0.5) + "\n");
    }
    System.out.println();
  }

  public void outputAwards(){
    System.out.println("-----AWARDS-----");
    for(Award award : awardsList){
      award.displayInfo();
      System.out.println();
    }
    System.out.println();
  }

  public void outputExtracurriculars(){
    System.out.println("---EXTRACURRICULARS---");
    for(Extracurricular activity : extracurricularList){
      activity.displayInfo();
      System.out.println();
    }
    System.out.println();
  }

  // Calculations
  private int calculateOverallAvg(){
    double sum = 0;
    for(int x = 0; x < courseAverages.size(); x++){
      sum += (int)(courseAverages.get(x)+0.5);
    }
    return (int)(sum/courseAverages.size()+0.5);
  }
}