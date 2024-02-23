//We want to create an adapter to adapt the EmployeeLdap class so our EmployeeClient can use it
//EmployeeClient can only add Employee type to its EmployeeList

//EmployeeLdap does not implement any interface, unlike EmployeeDB
public class EmployeeLdap {
    //Notice EmployeeLdap is similar to Employee interface but has different variable names

    //cn is an id
    private String cn;

    //surname means lastName
    private String surname;

    //givenName means firstName
    private String givenName;

    //mail means email address
    private String mail;

    public EmployeeLdap(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
