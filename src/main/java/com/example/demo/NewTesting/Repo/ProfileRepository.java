package com.example.demo.NewTesting.Repo;

import com.example.demo.NewTesting.Models.Data;
import com.example.demo.NewTesting.Models.UnpaidRecord;

import java.util.List;

public interface ProfileRepository {

//    List<Data> getAllProfile();

    List<Data> getProfileByMsisdn(String msisdn);
    List<UnpaidRecord> getUnpaidRecordByMsisdn(String msisdn);
}
