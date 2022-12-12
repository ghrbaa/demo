package com.example.demo.NewTesting.Repo;

import com.example.demo.NewTesting.Models.Profile;

import java.util.List;

public interface ProfileRepository {

    List<Profile> getAllProfile();

    List<Profile> getProfileByMsisdn(String msisdn);
}
