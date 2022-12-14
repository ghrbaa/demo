package com.example.demo.NewTesting.Models.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Date;

@Table(name = "payment_record")
@Data
@NoArgsConstructor
public class PaymentRecord {

    @Column(name = "trxid")
    private String trxid;
    @Column(name = "channel_trxid")
    private String channel_trxid;
    @Column(name = "value")
    private Integer value;
    @Column(name = "created_at")
    private String created_at;



}
