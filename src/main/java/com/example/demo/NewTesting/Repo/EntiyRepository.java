package com.example.demo.NewTesting.Repo;

import com.example.demo.NewTesting.Models.Entity.Data;
import com.example.demo.NewTesting.Models.Entity.PaymentRecord;
import com.example.demo.NewTesting.Models.Entity.PaidRecord;

import java.util.List;

public interface EntiyRepository {
    Data getProfileByMsisdn(String msisdn);
    List<PaidRecord> getUnpaidRecordByMsisdn(String msisdn);
    List<PaidRecord> getPaidRecordByMsisdn(String msisdn);
    List<PaymentRecord> getPaymentRecordByMsisdn(String msisdn);
}
