import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private Boolean anotherCompanyOwner;
    private Boolean pensioner;
    private Boolean publicServer;
    private float salary;


    public String fullName() {
        return this.name + " " + this.surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(Boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public Boolean getPensioner() {
        return pensioner;
    }

    public void setPensioner(Boolean pensioner) {
        this.pensioner = pensioner;
    }

    public Boolean getPublicServer() {
        return publicServer;
    }

    public void setPublicServer(Boolean publicServer) {
        this.publicServer = publicServer;
    }

    public float calculateYearlySalary() {
        return this.salary * 12;
    }

    public Boolean isMEI() {
        return !this.anotherCompanyOwner && !this.pensioner && !this.publicServer && this.salary*12 <= 130000 && getAge() >= 18;
    }

    public int getAge() {

        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        int currMonth = today.get(Calendar.MONTH);
        int birthMonth = birth.get(Calendar.MONTH);
        if (currMonth < birthMonth || (currMonth == birthMonth && today.get(Calendar.DAY_OF_MONTH) < birth.get(java.util.Calendar.DAY_OF_MONTH))) {
            age--;
        }
        return age;
    }

}
