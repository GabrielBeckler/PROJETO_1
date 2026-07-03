package Customer;

import java.time.LocalDate;

public class CompanyCustomer extends Customer {

    private String cnpj;
    private String corporateName;
    private String tradeName;
    private String stateRegistration;
    private LocalDate foundationDate;

    public CompanyCustomer(String name,
                                 LocalDate dateRegister,
                                 LocalDate legalOrigin,
                                 String cnpj,
                                 String corporateName,
                                 String tradeName,
                                 String stateRegistration,
                                 LocalDate foundationDate) {

        super(name, dateRegister, legalOrigin);

        this.cnpj = cnpj;
        this.corporateName = corporateName;
        this.tradeName = tradeName;
        this.stateRegistration = stateRegistration;
        this.foundationDate = foundationDate;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getStateRegistration() {
        return stateRegistration;
    }

    public void setStateRegistration(String stateRegistration) {
        this.stateRegistration = stateRegistration;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }
}