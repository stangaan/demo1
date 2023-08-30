package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
@Table(name = "Drinks")
public class Drinks {
    @Id
    @Column(name = "Id_drink")
    private int IdDrink;
    @Column(name = "Name_drink")
    private String NameDrink;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "prise")
    private int prise;

    @Column(name = "sale")
    private int sale;

    @Column(name = "having")
    private boolean having;

}
