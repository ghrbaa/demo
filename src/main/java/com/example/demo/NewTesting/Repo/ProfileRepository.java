package com.example.demo.NewTesting.Repo;

import com.example.demo.NewTesting.Models.Data;

import java.util.List;

public interface ProfileRepository {

    List<Data> getAllProfile();

    List<Data> getProfileByMsisdn(String msisdn);
}
