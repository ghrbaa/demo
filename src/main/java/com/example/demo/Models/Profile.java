package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {

    @Id
    private long customer_id;
    @Column
    private long msisdn;
    @Column
    private String created_at;
    @Column
    private String updated_at;
    @Column
    private String latest_paid_date;

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long id) {
        this.customer_id = customer_id;
    }

    public long getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(long msisdn) {
        this.msisdn = msisdn;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void getUpdate_at(String update_at) {
        this.updated_at = update_at;
    }

    public String getLatest_paid_date() {
        return latest_paid_date;
    }

    public void setLatest_paid_date(String latest_paid_date) {
        this.latest_paid_date = latest_paid_date;
    }
}
