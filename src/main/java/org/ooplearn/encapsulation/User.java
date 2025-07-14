package org.ooplearn.encapsulation;

public class User {

    private Integer id;
    private String name;
    private String password;
    private String uuid;

    // Getter for id
    public Integer getId() {
        return id;
    }

    // Setter for id
    public void setId(Integer id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter for uuid
    public String getUuid() {
        return uuid;
    }

    // Setter for uuid
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
