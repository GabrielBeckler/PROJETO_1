package Customer;

import java.time.LocalDate;

public class Customer {
    private static int contadorId = 1;
    private final int id;
    private String firstName;
    private String lastName;
    private LocalDate dateRegister;
    private String cep;
    private String email;
    private String tell;



    public Customer ( String firstName, String lastName,
                     LocalDate dateRegister,
                     String cep, String email, String tell){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = contadorId ++;
        this.dateRegister = dateRegister;
        this.cep = cep;
        this.email = email;
        this.tell = tell;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getLastName() {return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFistName() {return firstName; }

    public void setFistName(String firstName) { this.firstName = firstName; }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public void updateContact(String email, String tell){
        this.email = email;
        this.tell = tell;
    }

    public void updateCep(String cep){
        this.cep = cep;
    }

    public void updateDateRegister(){
        this.dateRegister = dateRegister;
    }

    public boolean hasEmail(){
        return email != null && !email.isBlank();
    }

    public boolean hasTell(){
        return tell != null && !tell.isBlank();
    }

    public void showCostumer() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + getFullName());
        System.out.println("Email: " + email);
        System.out.println("Telephone: " + tell);
        System.out.println("CEP: " + cep);
        System.out.println("Registration date: " + dateRegister);
    }


}
