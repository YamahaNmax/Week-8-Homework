package HomeWork;

public class Que17 {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) return true;
        else return false;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Que17 obj = new Que17();
        obj.setFirstName(""); // firstName is set to empty string
        obj.setLastName(""); // lastName is set to empty string
        obj.setAge(10);
        System.out.println("fullName= " + obj.getFullName());
        System.out.println("teen= " + obj.isTeen());
        obj.setFirstName("John"); // firstName is set to John
        obj.setAge(18);
        System.out.println("fullName= " + obj.getFullName());
        System.out.println("teen= " + obj.isTeen());
        obj.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + obj.getFullName());
    }
}
