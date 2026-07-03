package Customer;

import java.time.LocalDate;

public class Customer {
    private static int contadorId = 1;
    private final int id;
    private String name;
    private LocalDate dateRegister;

    public Customer ( String name,
                      LocalDate dateRegister,
                      LocalDate legalOrigin){
        this.id = contadorId ++;
        this.name = name;
        this.dateRegister = dateRegister;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }
}
