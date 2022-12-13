package com.example.demo.NewTesting.Repo;

import com.example.demo.NewTesting.model.ResponseMessage;

public interface ResponseMessageRespository {

//    ResponseMessage gettingAll();
    ResponseMessage getProfileByMsisdn(String msisdn);

    ResponseMessage getUnpaidRecordByMsisdn(String msisdn);
}
