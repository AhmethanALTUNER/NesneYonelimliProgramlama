package Test;
import Person.MyDate;
import Person.Employee;
import Person.Faculty;
import Person.Person;
import Person.Staff;
import Person.Student;


public class Test {
    public static void main(String[] args) {
        Person person = new Person(
            "Ahmet Yılmaz", 
            "Atatürk Cad. No:12, Ankara", 
            "05551112233", 
            "ahmet@ornek.com"
        );

        Student student = new Student(
            "Zeynep Kaya", 
            "Üniversite Kampüsü Yurt 3, İstanbul", 
            "05442223344", 
            "zeynep@ogr.edu.tr", 
            Student.JUNIOR
        );

        Employee employee = new Employee(
            "Mehmet Demir", 
            "İnönü Mah. No:45, İzmir", 
            "05333334455", 
            "mehmet@sirket.com", 
            "B Blok No:204", 
            65000.0, 
            new MyDate(2021, 8, 15)
        );

        Faculty faculty = new Faculty(
            "Prof. Dr. Ayşe Çelik", 
            "Akademisyen Evleri No:8, Eskişehir", 
            "05054445566", 
            "ayse.celik@univ.edu.tr", 
            "Mühendislik Fakültesi D-301", 
            95000.0, 
            new MyDate(2015, 2, 1), 
            "Pazartesi - Çarşamba 10:00 - 12:00", 
            "Profesör"
        );

        Staff staff = new Staff(
            "Caner Erkin", 
            "Cumhuriyet Cad. No:7, Bursa", 
            "05115556677", 
            "caner@idari.univ.edu.tr", 
            "Öğrenci İşleri Zemin Kat", 
            52000.0, 
            new MyDate(2023, 5, 20), 
            "Daire Başkanı"
        );

        Person[] people = { person, student, employee, faculty, staff };

        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}
