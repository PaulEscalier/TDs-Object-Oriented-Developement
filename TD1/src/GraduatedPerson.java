public class GraduatedPerson extends Person {
    String diploma;
    public GraduatedPerson(String firstName, String lastName, String diploma)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.diploma = diploma;
    }
    public GraduatedPerson(String firstName, String lastName)
    {
        this(firstName, lastName, "engineer");
    }
    public GraduatedPerson(){
        this("not defined", "not defined", "not defined");
    }
    public String getDiploma(){
        return diploma;
    }
    public void setDiploma(String diploma){
        this.diploma = diploma;
    }

    @Override
    public String toString() {
        this.nameFormat();
        return "("+this.firstName+", "+this.lastName+", "+this.diploma+")";

    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass().equals(this.getClass())){
            GraduatedPerson gp = (GraduatedPerson)obj;
            return gp.firstName.equals(this.firstName) && gp.lastName.equals(this.lastName) && gp.diploma.equals(this.diploma);
        }else{
            return false;
        }
    }
}
