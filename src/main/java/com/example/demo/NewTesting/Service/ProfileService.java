package com.example.demo.NewTesting.Service;

import com.example.demo.NewTesting.Models.Data;
import com.example.demo.NewTesting.Models.UnpaidRecord;
import com.example.demo.NewTesting.Repo.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService implements ProfileRepository {

    @Autowired
    JdbcTemplate template;

//    @Override
//    public List<Data> getAllProfile() {
//        String sql ="SELECT * FROM profile";
//        return template.query(sql, BeanPropertyRowMapper.newInstance(Data.class));
//    }

    @Override
    public List<Data> getProfileByMsisdn(String msisdn) {
        String sql = "SELECT * FROM profile WHERE msisdn = " + msisdn;
        return template.query(sql, BeanPropertyRowMapper.newInstance(Data.class));
    }

    @Override
    public List<UnpaidRecord> getUnpaidRecordByMsisdn(String msisdn){
        String sql = "SELECT loan_record.customer_id, loan_record.offer_id_choose, " +
                "loan_record.channel_trxid, loan_record.value, loan_record.initiate_offer_time, " +
                "loan_record.due_date FROM loan_record INNER JOIN profile ON loan_record.customer_id = " +
                "profile.customer_id WHERE profile.msisdn = " + msisdn;
        return template.query(sql, BeanPropertyRowMapper.newInstance(UnpaidRecord.class));
    }
}
