public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(){
        this("not Defined", "not Defined");
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void nameFormat(){
        this.lastName = this.lastName.toUpperCase();
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
    }
    public String toString(){
        return "("+firstName+"," +lastName+")";
    }
    public void printPerson(){
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return firstName.equals(other.firstName) && lastName.equals(other.lastName);
    }

}
