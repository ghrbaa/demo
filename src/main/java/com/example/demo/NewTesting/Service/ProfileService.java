package com.example.demo.NewTesting.Service;

import com.example.demo.NewTesting.Models.Profile;
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
    @Override
    public List<Profile> getAllProfile() {
        String sql ="SELECT * FROM profile";
        return template.query(sql, BeanPropertyRowMapper.newInstance(Profile.class));
    }

    @Override
    public List<Profile> getProfileByMsisdn(String msisdn) {
        String sql = "SELECT * FROM profile WHERE msisdn = " + msisdn;
        return template.query(sql, BeanPropertyRowMapper.newInstance(Profile.class));
    }

}
