package com.example.demo.NewTesting.Repo;

import com.example.demo.NewTesting.Models.Data;
import com.example.demo.NewTesting.Models.UnpaidRecord;

import java.util.List;

public interface ProfileRepository {
    Data getProfileByMsisdn(String msisdn);
    UnpaidRecord getUnpaidRecordByMsisdn(String msisdn);
}
