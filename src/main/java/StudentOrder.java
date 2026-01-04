import java.util.Comparator;

public class StudentOrder implements Comparator<Student> {
  public int compare(Student a, Student b) {
    return a.GetLastName().compareTo(b.GetLastName());
  }
}
