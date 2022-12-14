package com.example.demo.NewTesting.Models.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "loan_record")
@Data
@NoArgsConstructor
public class PaidRecord {

    @Column(name = "offer_id_choose")
    private String offer_id_choose;
    @Column(name = "channel_trxid")
    private String channel_trxid;
    @Column(name = "value")
    private Integer value;
    @Column(name = "initiate_offer_time")
    private String initiate_offer_time;
    @Column(name = "due_date")
    private String due_date;

}
