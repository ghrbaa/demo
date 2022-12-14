package com.example.demo.NewTesting.Service;

import com.example.demo.NewTesting.Models.Entity.Data;
import com.example.demo.NewTesting.Models.Entity.PaymentRecord;
import com.example.demo.NewTesting.Models.Entity.PaidRecord;
import com.example.demo.NewTesting.Repo.EntiyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntiyService implements EntiyRepository {

    @Autowired
    JdbcTemplate template;

//    @Override
//    public List<Data> getAllProfile() {
//        String sql ="SELECT * FROM profile";
//        return template.query(sql, BeanPropertyRowMapper.newInstance(Data.class));
//    }

    @Override
    public Data getProfileByMsisdn(String msisdn) {
        String sql = "SELECT * FROM profile WHERE msisdn = " + msisdn;
        return template.queryForObject(sql, BeanPropertyRowMapper.newInstance(Data.class));
    }

    @Override
    public List<PaidRecord> getUnpaidRecordByMsisdn(String msisdn){
        String sql = "SELECT loan_record.customer_id, loan_record.offer_id_choose, " +
                "loan_record.channel_trxid, loan_record.value, loan_record.initiate_offer_time,loan_record.due_date " +
                "FROM loan_record INNER JOIN profile ON loan_record.customer_id = profile.customer_id " +
                "WHERE loan_record.paid_amount = 0 AND profile.msisdn =" + msisdn;
        return template.query(sql, BeanPropertyRowMapper.newInstance(PaidRecord.class));
    }

    @Override
    public List<PaidRecord> getPaidRecordByMsisdn(String msisdn){
        String sql = "SELECT loan_record.customer_id, loan_record.offer_id_choose, " +
                "loan_record.channel_trxid, loan_record.value, loan_record.initiate_offer_time, " +
                "loan_record.due_date FROM loan_record INNER JOIN profile ON loan_record.customer_id = " +
                "profile.customer_id WHERE profile.msisdn = " + msisdn;
        return template.query(sql, BeanPropertyRowMapper.newInstance(PaidRecord.class));
    }

    @Override
    public List<PaymentRecord> getPaymentRecordByMsisdn(String msisdn) {
        String sql = "SELECT trxid, channel_trxid, payment_record.value, payment_record.created_at " +
                "FROM `payment_record` " +
                "INNER JOIN profile ON payment_record.customer_id = profile.customer_id " +
                "WHERE profile.msisdn = " + msisdn;
        return template.query(sql, BeanPropertyRowMapper.newInstance(PaymentRecord.class));
    }
}
