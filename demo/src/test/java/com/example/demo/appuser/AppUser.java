package com.example.demo.appuser;

import org.springframework.security.core.userdetails.UserDetails;

public class AppUser implements UserDetails {
    private Long id;
    private String name;
    private String username;
    private String email;
}