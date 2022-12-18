package com.example.demo.NewTesting.Service;

import com.example.demo.NewTesting.DTO.DataAndPaidDTO;
import com.example.demo.NewTesting.Models.Data;
import com.example.demo.NewTesting.Models.PaymentRecord;
import com.example.demo.NewTesting.Models.PaidRecord;
import com.example.demo.NewTesting.Repo.EntiyRepository;
import com.example.demo.NewTesting.Repo.ResponseMessageRespository;
import com.example.demo.NewTesting.Models.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class ResponseMessageService implements ResponseMessageRespository {
    @Autowired
    EntiyRepository pr;

    @Override
    public ResponseMessage getProfileByMsisdn(String msisdn) {
        ResponseMessage responseMessage = new ResponseMessage();
        Data data = pr.getProfileByMsisdn(msisdn);
        List<PaidRecord> unpaidRecords = pr.getUnpaidRecordByMsisdn(msisdn);
        List<PaidRecord> paidRecords = pr.getPaidRecordByMsisdn(msisdn);
        List<PaymentRecord> paymentRecords = pr.getPaymentRecordByMsisdn(msisdn);
        responseMessage.setStatus(HttpStatus.OK.value());
        responseMessage.setMessage("Success");
        responseMessage.setTransaction_id("test123456789");
        responseMessage.setQuery_trx_id("QUERY2212021405241919181289");
        responseMessage.setTook(136);
        responseMessage.setData(data);
        responseMessage.setUnpaid_record(unpaidRecords);
        responseMessage.setPaid_record(paidRecords);
        responseMessage.setPayment_record(paymentRecords);
        return responseMessage;
    }

    public DataAndPaidDTO getCustom(String msisdn) {
        Data data = pr.getProfileByMsisdn(msisdn);
//        List<PaidRecord> unpaidRecords = pr.getUnpaidRecordByMsisdn(msisdn);
        List<PaidRecord> paidRecords = pr.getPaidRecordByMsisdn(msisdn);
//        List<PaymentRecord> paymentRecords = pr.getPaymentRecordByMsisdn(msisdn);
//        responseMessage.setStatus(HttpStatus.OK.value());
//        responseMessage.setMessage("Success");
//        responseMessage.setTransaction_id("test123456789");
//        responseMessage.setQuery_trx_id("QUERY2212021405241919181289");
//        responseMessage.setTook(136);
//        responseMessage.setData(data);
//        responseMessage.setUnpaid_record(unpaidRecords);
//        responseMessage.setPaid_record(paidRecords);
//        responseMessage.setPayment_record(paymentRecords);
        DataAndPaidDTO dataAndPaidDTO = new DataAndPaidDTO(data, paidRecords);
        return dataAndPaidDTO;
    }


//    @Override
//    public ResponseMessage getProfileByMsisdn(String msisdn) {
//        ResponseMessage responseMessage = new ResponseMessage();
//        Data data = pr.getProfileByMsisdn(msisdn);
//        List<UnpaidRecord> unpaidRecords = pr.getUnpaidRecordByMsisdn(msisdn);
//        List<PaymentRecord> paymentRecords = pr.getPaymentRecordByMsisdn(msisdn);
//        responseMessage.setStatus(HttpStatus.OK.value());
//        responseMessage.setMessage("Success");
//        responseMessage.setTransaction_id("test123456789");
//        responseMessage.setQuery_trx_id("QUERY2212021405241919181289");
//        responseMessage.setTook(136);
//        responseMessage.setData(data);
//        responseMessage.setUnpaid_record(unpaidRecords);
//        responseMessage.setPaid_record("[]");
//        responseMessage.setPayment_record(paymentRecords);
//        return responseMessage;
//    }

//    @Override
//    public ResponseMessage gettingAll() {
//        ResponseMessage response =new ResponseMessage();
//        List<Data> data = pr.getAllProfile();
//        response.setStatus(HttpStatus.OK.value());
//        response.setMessage("Success");
//        response.setTransaction_id("test123456789");
//        response.setQuery_trx_id("QUERY2212021405241919181289");
//        response.setTook(136);
//        response.setData(data);
//        return response;
//    }

//    @Override
//    public ResponseMessage getUnpaidRecordByMsisdn(String msisdn) {
//        ResponseMessage responseMessage = new ResponseMessage();
//        List<UnpaidRecord> unpaidRecord = pr.getUnpaidRecordByMsisdn(msisdn);
//        responseMessage.setStatus(HttpStatus.OK.value());
//        responseMessage.setMessage("Success");
//        responseMessage.setTransaction_id("test123456789");
//        responseMessage.setQuery_trx_id("QUERY2212021405241919181289");
//        responseMessage.setTook(136);
//        responseMessage.setData("{}");
//        responseMessage.setUnpaid_record(unpaidRecord);
//        responseMessage.setPaid_record("{}");
//        responseMessage.setPayment_record("{}");
//        return responseMessage;
//    }

}
