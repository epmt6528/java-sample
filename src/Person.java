public class Person {
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

    public void setFirstName(String input) {
        firstName = input;
    }

    public void setLastName(String input) {
        lastName = input;
    }

    public void setAge(int input) {
        if(input < 0 || 100 < input) {
            age = 0;
            return;
        }

        age = input;
    }

    public boolean isTeen() {
        return 12 < age && age < 20;
    }

    public String getFullName() {
        boolean isFirstNameEmpty = firstName.isEmpty();
        boolean isLastNameEmpty = lastName.isEmpty();

        if(isFirstNameEmpty && isLastNameEmpty) {
            return "";
        }

        if(isFirstNameEmpty) {
            return lastName;
        }

        if(isLastNameEmpty) {
            return firstName;
        }

        return firstName + " " + lastName;
    }
}