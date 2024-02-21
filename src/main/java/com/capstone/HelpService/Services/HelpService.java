package com.capstone.HelpService.Services;

import com.capstone.HelpService.DTOs.HelpRequestBodyDTO;
import com.capstone.HelpService.DTOs.ResponseStatus;
import com.capstone.HelpService.Repositories.HelpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelpService {
    final HelpRepository helpRepository;

    @Autowired
    public HelpService(HelpRepository helpRepository) {
        this.helpRepository = helpRepository;
    }

    public ResponseStatus sendHelp(HelpRequestBodyDTO helpContent){
        var bookState = helpContent.getBookingState();
        var ticketId = helpContent.getTicketId();
        var userName = helpContent.getUserName();
        var contactNumber = helpContent.getContactNumber();
        var email = helpContent.getEmail();
        var messages = helpContent.getMessages();

        helpRepository.sendHelp(bookState, ticketId, userName, contactNumber, email, messages);

        return new ResponseStatus(
           200,
           "Send Successful",
                "Successful"
        );
    }
}
