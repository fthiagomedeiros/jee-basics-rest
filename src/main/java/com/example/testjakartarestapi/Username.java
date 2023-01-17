package com.example.testjakartarestapi;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "USERNAME")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@NamedQuery(
        name="findAllUsernames",
        query="SELECT c FROM Username c"
)
public class Username implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;
    private String lastName;
    private String firstName;
    private String address;
    private String city;
}
