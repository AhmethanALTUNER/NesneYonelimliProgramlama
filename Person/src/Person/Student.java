package Person;

public class Student extends Person {
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    private int classStatus;

    public Student(String name, String address, String phoneNumber, String emailAddress, int classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    public int getClassStatus() {
        return classStatus;
    }

    public String getStatusDescription() {
        switch (classStatus) {
            case FRESHMAN:  return "1. Sınıf (Freshman)";
            case SOPHOMORE: return "2. Sınıf (Sophomore)";
            case JUNIOR:    return "3. Sınıf (Junior)";
            case SENIOR:    return "4. Sınıf (Senior)";
            default:        return "Bilinmiyor";
        }
    }

    @Override
    public String toString() {
        return "[Student] " +
               "Ad: " + getName() + 
               ", Sınıf Düzeyi: " + getStatusDescription() + 
               ", Adres: " + getAddress() + 
               ", Telefon: " + getPhoneNumber() + 
               ", E-posta: " + getEmailAddress();
    }
}