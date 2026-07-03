package Customer;

import java.time.LocalDate;

public class PersonCustomer extends Customer {

    private String cpf;
    private String rg;
    private LocalDate birthDate;
    private String profession;

    public PersonCustomer(String name,
                               LocalDate dateRegister,
                               LocalDate legalOrigin,
                               String cpf,
                               String rg,
                               LocalDate birthDate,
                               String profession) {

        super(name, dateRegister, legalOrigin);

        this.cpf = cpf;
        this.rg = rg;
        this.birthDate = birthDate;
        this.profession = profession;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}