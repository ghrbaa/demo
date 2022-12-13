package com.example.demo.NewTesting.Models;

import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Entity
//@Table(name = "profile")

@lombok.Data
@NoArgsConstructor
public class Data {

    @Column(name = "msisdn", nullable = false)
    private String msisdn;
    @Column(name = "outstanding")
    private String outstanding;
    @Column(name = "mode")
    private String mode;
    @Column(name = "status_to_loan")
    private String status_to_loan;
    @Column(name = "latest_loan_value")
    private String latest_loan_value;
    @Column(name = "curr_sequence")
    private String curr_sequence;
    @Column(name = "remaining_loan")
    private String remaining_loan;
    @Column(name = "maximum_sequence")
    private String maximum_sequence;
    @Column(name = "exposure")
    private String exposure;
    @Column(name = "eligible_channel")
    private String eligible_channel;

}
