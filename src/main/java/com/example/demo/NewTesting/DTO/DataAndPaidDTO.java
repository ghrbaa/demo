package com.example.demo.NewTesting.DTO;

import com.example.demo.NewTesting.Models.PaidRecord;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import java.util.List;

@Data
public class DataAndPaidDTO {

    private String msisdn;
    private String outstanding;
    private String mode;
    private String status_to_loan;
    private String latest_loan_value;
    private String curr_sequence;
    private String remaining_loan;
    private String maximum_sequence;
    private String exposure;
    private String eligible_channel;
    private List<PaidRecord> paidRecord;

    public DataAndPaidDTO(com.example.demo.NewTesting.Models.Data data, List<PaidRecord> paidRecord) {
        this.msisdn = data.getMsisdn();
        this.outstanding = data.getOutstanding();
        this.mode = data.getMode();
        this.status_to_loan = data.getStatus_to_loan();
        this.latest_loan_value = data.getLatest_loan_value();
        this.curr_sequence = data.getCurr_sequence();
        this.remaining_loan = data.getRemaining_loan();
        this.maximum_sequence = data.getMaximum_sequence();
        this.exposure = data.getExposure();
        this.eligible_channel = data.getEligible_channel();
        this.paidRecord = paidRecord;
    }
}
