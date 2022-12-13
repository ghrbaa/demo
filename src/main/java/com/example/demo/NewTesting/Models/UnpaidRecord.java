package com.example.demo.NewTesting.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Date;

@Table(name = "loan_record")
@Data
@NoArgsConstructor
public class UnpaidRecord {

    @Column(name = "offer_id_choose")
    private String offer_id_choose;
    @Column(name = "channel_trxid")
    private String channel_trxid;
    @Column(name = "value")
    private Integer value;
    @Column(name = "initiate_offer_time")
    private Date initiate_offer_time;
    @Column(name = "due_date")
    private Date due_date;

}
