package za.ac.cput.cms.booking.entity.guest;
/*
@Author       : Themba Khanyile
Student Number: 217238173
Due date: 20 October 2021
Particulars.java
 */
public class Particulars
{
    private String   idNo;
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    protected Particulars(){

    }

    private Particulars(Particulars.Builder z){
        this.idNo        = z.idNo;
        this.firstName   = z.firstName;
        this.lastName    = z.lastName;
        this.dateOfBirth = z.dateOfBirth;
    }

    public String getidNo() {
        return idNo;
    }
    public String getfirstName()
    {
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public String getdateOfBirth(){
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Particulars{" +
                "idNo=" + idNo +
                ", firstName=" + firstName +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public static class Builder{
        private String idNo;
        private String firstName;
        private String lastName;
        private String dateOfBirth;

        public Particulars.Builder setidNo(String idNo){
            this.idNo = idNo;
            return this;
        }

        public Particulars.Builder setfirstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Particulars.Builder setlastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Particulars.Builder setdateOfBirth(String dateOfBirth){
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Particulars build(){
            return new Particulars(this);
        }

        public Particulars.Builder copy (Particulars c){
            this.idNo = c.idNo;
            this.firstName = c.firstName;
            this.lastName = c.lastName;
            this.dateOfBirth = c.dateOfBirth;
            return this;
        }
    }
}
