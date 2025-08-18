package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String role;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private UserEntity user;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public UserEntity getUser() { return user; }
    public void setUser(UserEntity user) { this.user = user; }
}
