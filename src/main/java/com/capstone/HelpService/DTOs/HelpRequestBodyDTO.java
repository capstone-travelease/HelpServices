package com.capstone.HelpService.DTOs;

public class HelpRequestBodyDTO {
    private Boolean bookingState;
    private Integer ticketId;
    private String userName;
    private String contactNumber;
    private String email;
    private String messages;

    public HelpRequestBodyDTO(Boolean bookingState, Integer ticketId, String userName, String contactNumber, String email, String messages) {
        this.bookingState = bookingState;
        this.ticketId = ticketId;
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.messages = messages;
    }

    public Boolean getBookingState() {
        return bookingState;
    }

    public void setBookingState(Boolean bookingState) {
        this.bookingState = bookingState;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }
}
