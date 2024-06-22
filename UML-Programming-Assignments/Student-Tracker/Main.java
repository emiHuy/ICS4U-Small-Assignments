public class Main {
  public static void main(String[] args) {
    
    Student student = new Student(100000000, "Emily Huynh", 12);
    Student student2 = new Student(100000001, "John Doe", 11);

    Course course1 = new Course("SPH4U", "Physics", "Ms. Blackwell");
    Course course2 = new Course("ICS4U", "Computer Science", "Ms. Luce");
    Course course3 = new Course("MCV4U", "Calculus and Vectors", "Mr. Brown");
    Course course4 = new Course("SPH3U", "Physics", "Mr. Farrell");
    Course course5 = new Course("BAF3M", "Accounting", "Ms. Field");
    Course course6 = new Course("MCR3U", "Functions", "Ms. Lim");
  
    Award award1 = new Award("Honour Roll", "Achieved overall average of 80% or higher.");
    Award award2 = new Award("Silver Medal", "Achieved overall average of 90% or higher.");

    Sport sport1 = new Sport("Senior Girls Volleyball", "Ms. Spear");
    Sport sport2 = new Sport("Senior Girls Soccer", "Mr. Secours");
    Sport sport3 = new Sport("Varsity Co-ed Ultimate Frisbee", "Ms. Olson, Ms. Atkinson, Mr. MacLeod");

    Club club1 = new Club("Mathletes", "Ms. Lim");
    Club club2 = new Club("Science Club", "Ms. Wilkinson");
    
    Extracurricular volunteer = new Extracurricular("Peer Tutoring", "Ms. Kilfoil");

    student.addCourse(course1);
    student.addCourse(course2);
    student.addCourse(course3);
    student2.addCourse(course2);
    student2.addCourse(course4);
    student2.addCourse(course5);
    student2.addCourse(course6);

    // Course marks are set after course is added, 
    // as course marks are added later on after student enrollment
    student.setCourseMark("SPH4U", 94);
    student.setCourseMark("ICS4U", 98.42);
    student.setCourseMark("MCV4U", 98);
    student2.setCourseMark("SPH3U", 82);
    student2.setCourseMark("ICS4U", 88);
    student2.setCourseMark("BAF3M", 91);
    student2.setCourseMark("MCR3U", 89);

    student.addAward(award1);
    student.addAward(award2);
    student2.addAward(award1);

    student.addExtracurricular(sport1);
    student.addExtracurricular(sport2);
    student.addExtracurricular(sport3);

    student.addExtracurricular(club1);
    student.addExtracurricular(club2);
    student.addExtracurricular(volunteer);
    student2.addExtracurricular(sport3);
    student2.addExtracurricular(club1);

    student.outputStudentInfo();
    student.outputCourses();
    student.outputAwards();
    student.outputExtracurriculars();
    student2.outputStudentInfo();
    student2.outputCourses();
    student2.outputAwards();
    student2.outputExtracurriculars();
  }  
}