package com.example.demo.NewTesting.Models;

import javax.persistence.*;

//@Entity
//@Table(name = "profile")
public class Profile {

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

    public Profile(String msisdn, String outstanding, String mode, String status_to_loan, String total_loan, String curr_sequence, String remaining_loan, String sequence_limit, String exposure_limit, String eligible_channel) {
        this.msisdn = msisdn;
        this.outstanding = outstanding;
        this.mode = mode;
        this.status_to_loan = status_to_loan;
        this.latest_loan_value = latest_loan_value;
        this.curr_sequence = curr_sequence;
        this.remaining_loan = remaining_loan;
        this.maximum_sequence = maximum_sequence;
        this.exposure = exposure;
        this.eligible_channel = eligible_channel;
    }

    public Profile(){

    }
    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getOutstanding() {
        return outstanding;
    }

    public void setOutstanding(String outstanding) {
        this.outstanding = outstanding;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getStatus_to_loan() {
        return status_to_loan;
    }

    public void setStatus_to_loan(String status_to_loan) {
        this.status_to_loan = status_to_loan;
    }

    public String getLatest_loan_value() {
        return latest_loan_value;
    }

    public void setLatest_loan_value(String latest_loan_value) {
        this.latest_loan_value = latest_loan_value;
    }

    public String getCurr_sequence() {
        return curr_sequence;
    }

    public void setCurr_sequence(String curr_sequence) {
        this.curr_sequence = curr_sequence;
    }

    public String getRemaining_loan() {
        return remaining_loan;
    }

    public void setRemaining_loan(String remaining_loan) {
        this.remaining_loan = remaining_loan;
    }

    public String getMaximum_sequence() {
        return maximum_sequence;
    }

    public void setMaximum_sequence(String maximum_sequence) {
        this.maximum_sequence = maximum_sequence;
    }

    public String getExposure() {
        return exposure;
    }

    public void setExposure(String exposure) {
        this.exposure = exposure;
    }

    public String getEligible_channel() {
        return eligible_channel;
    }

    public void setEligible_channel(String eligible_channel) {
        this.eligible_channel = eligible_channel;
    }
}
