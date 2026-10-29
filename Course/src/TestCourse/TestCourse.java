package TestCourse;
import Course.Course;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Veri Yapıları");
        Course course2 = new Course("Veritabanı Sistemleri");

        course1.addStudent("Ahmet Yılmaz");
        course1.addStudent("Mehmet Demir");
        course1.addStudent("Ayşe Kaya");

        course2.addStudent("Ali Çelik");
        course2.addStudent("Zeynep Şahin");

        System.out.println(course1.getCourseName() + " dersindeki öğrenci sayısı: " 
                           + course1.getNumberOfStudents());
        String[] students1 = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students1[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : ""));
        }
        System.out.println("\n");

        System.out.println("Mehmet Demir dersten çıkarılıyor...");
        course1.dropStudent("Mehmet Demir");

        System.out.println(course1.getCourseName() + " güncel öğrenci sayısı: " 
                           + course1.getNumberOfStudents());
        students1 = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students1[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : ""));
        }
    }
}
