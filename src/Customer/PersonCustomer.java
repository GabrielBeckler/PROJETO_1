package Customer;

import java.time.LocalDate;

public class PersonCustomer extends Customer {

    private String cpf;
    private String rg;
    private LocalDate birthDate;
    private String profession;

    public PersonCustomer(String fistName,
                          String lastName,
                               LocalDate dateRegister,
                               String cep,
                               String email,
                               String tell,
                               String cpf,
                               String rg,
                               LocalDate birthDate,
                               String profession) {

        super(fistName, lastName, dateRegister, cep, email, tell);

        this.cpf = cpf;
        this.rg = rg;
        this.birthDate = birthDate;
        this.profession = profession;
    }

//    public PersonCustomer(String firstName, String lastName, LocalDate now, String cep, String email, String phone, String cpf, LocalDate birthDate) {
//        super();
//    }

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

    public int getAge() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    public boolean isAdult() {
        return getAge() > 18;
    }

    public void changeProfession(String profession){
        this.profession = profession;
    }

    public String getMaskedCpf() {
        return cpf.substring(0, 3) + ".***.***-" + cpf.substring(9);
    }


}