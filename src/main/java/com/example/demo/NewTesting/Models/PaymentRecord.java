package com.example.demo.NewTesting.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentRecord {

    @Id
    private long customer_id;

    @Column
    private String trxid;

    @Column
    private String created_at;

    @Column
    private String channel_trxid;

    @Column
    private Long value;

    public String getChannel_trxid() {
        return channel_trxid;
    }

    public void setChannel_trxid(String channel_trxid) {
        this.channel_trxid = channel_trxid;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public String getTrxid() {
        return trxid;
    }

    public void setTrxid(String trxid) {
        this.trxid = trxid;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
