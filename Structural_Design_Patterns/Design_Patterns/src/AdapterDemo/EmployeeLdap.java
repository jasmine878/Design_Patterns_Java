package AdapterDemo;//We want to create an adapter to adapt the AdapterDemo.EmployeeLdap class so our AdapterDemo.EmployeeClient can use it
//AdapterDemo.EmployeeClient can only add AdapterDemo.Employee type to its EmployeeList

//AdapterDemo.EmployeeLdap does not implement any interface, unlike AdapterDemo.EmployeeDB
public class EmployeeLdap {
    //Notice AdapterDemo.EmployeeLdap is similar to AdapterDemo.Employee interface but has different variable names

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
