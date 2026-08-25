package Identity;

public class User {
    private Long id;
    private String email;
    private String passwordHash;
    private boolean active;
    private Role role;

    public User(
            Long id,
            String email,
            String passwordHash,
            Role role
    ){

        this.id = id;
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
        this.active = true;
    }

    public void deactivate(){
        this.active = false;
    }


    public void showUser(){

        System.out.println(
                "Usuário: " + email
        );


        System.out.println(
                "Cargo: " + role.getName()
        );


        System.out.println(
                "Ativo: " + active
        );

    }

    public Role getRole(){

        return role;

    }

}