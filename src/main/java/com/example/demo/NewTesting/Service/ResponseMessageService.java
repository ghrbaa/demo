package com.example.demo.NewTesting.Service;

import com.example.demo.NewTesting.Models.Profile;
import com.example.demo.NewTesting.Repo.ProfileRepository;
import com.example.demo.NewTesting.Repo.ResponseMessageRespository;
import com.example.demo.NewTesting.model.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseMessageService implements ResponseMessageRespository {
    @Autowired
    ProfileRepository pr;

    @Override
    public ResponseMessage gettingAll() {
        ResponseMessage response =new ResponseMessage();
        List<Profile> profile = pr.getAllProfile();
        response.setStatus(HttpStatus.OK.value());
        response.setMessage("Success");
        response.setTransaction_id("test123456789");
        response.setQuery_trx_id("QUERY2212021405241919181289");
        response.setTook(136);
        response.setData(profile);
        return response;
    }

    @Override
    public ResponseMessage getProfileByMsisdn(String msisdn) {
        ResponseMessage responseMessage = new ResponseMessage();
        List<Profile> profile = pr.getProfileByMsisdn(msisdn);
        responseMessage.setStatus(HttpStatus.OK.value());
        responseMessage.setMessage("Success");
        responseMessage.setTransaction_id("test123456789");
        responseMessage.setQuery_trx_id("QUERY2212021405241919181289");
        responseMessage.setTook(136);
        responseMessage.setData(profile);
        return responseMessage;
    }

}
