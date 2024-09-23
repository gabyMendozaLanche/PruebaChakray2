package com.example.demo.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String name;
    private String email;
    private String password;
    private LocalDate created_at;
    private String [] workaddress;
    private String [] homeaddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "UsuarioModel{" + "id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", created_at=" + created_at + ", workaddress=" + workaddress + ", homeaddress=" + homeaddress + '}';
    }

    public String[] getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(String[] workaddress) {
        this.workaddress = workaddress;
    }

    public String[] getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String[] homeaddress) {
        this.homeaddress = homeaddress;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioModel other = (UsuarioModel) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.created_at, other.created_at)) {
            return false;
        }
        if (!Arrays.deepEquals(this.workaddress, other.workaddress)) {
            return false;
        }
        return Arrays.deepEquals(this.homeaddress, other.homeaddress);
    }
    
    

    
    
}