package com.attractor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String email;
    private int password;
    private int quantity;
    private String subscriptions;
    private String subscribers;
}
