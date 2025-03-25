package Encapsulation;

public class StudentManagement {

    private String name = "yoyo";
    private String pswd = "432";
    private char gender = 'M';
    private int age = 23;
    private String branch = "CS";
    private String email = "yoyo@gmail.com";

    public void update(String email, String pswd, int age, char gender) {
        if (this.email.equals(email) && this.pswd.equals(pswd)) {  // Using .equals() to compare strings
            this.age = age;
            this.gender = gender;
            System.out.println(age + " " + gender);
        } else {
            System.out.println("CREDENTIALS DO NOT MATCH.");
        }
    }

    public void fetch(String email) {
        if (this.email.equals(email)) {  // Using .equals() to compare strings
            System.out.println(name + " " + age + " " + gender + " " + branch);
        } else {
            System.out.println("EMAIL NOT MATCHED.");
        }
    }

    public void updatepswd(String pswd, String newpswd, String newpswd2) {
        if (this.pswd.equals(pswd)) {  // Using .equals() to compare strings
            if (newpswd.equals(newpswd2)) {  // Using .equals() to compare strings
                this.pswd = newpswd;  // Correctly updating the instance variable
                System.out.println("New password changed");
            } else {
                System.out.println("Password do not match.");
            }
        } else {
            System.out.println("WRONG PASSWORD.");
        }
    }
}
