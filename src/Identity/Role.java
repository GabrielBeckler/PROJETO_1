package Identity;

import java.util.ArrayList;
import java.util.List;


public class Role {

    private Long id;
    private String name;

    private List<Permission> permissions = new ArrayList<>();


    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public void addPermission(Permission permission) {
        permissions.add(permission);
    }


    public String getName() {
        return name;
    }


    public List<Permission> getPermissions() {
        return permissions;
    }


    public void showPermissions(){

        System.out.println(
                "Permissões do cargo: " + name
        );


        for(Permission permission : permissions){

            System.out.println(
                    "- " + permission.getName()
            );
        }
    }
}