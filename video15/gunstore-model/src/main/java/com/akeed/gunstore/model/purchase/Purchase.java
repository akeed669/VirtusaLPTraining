package com.akeed.gunstore.model.purchase;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue
    int id;
    int customerId;
    int firearmId;
    LocalDateTime purchaseDate;
    String salesAgentName;
}
