package com.capstone.HelpService.Repositories;

import com.capstone.HelpService.DTOs.HelpRequestBodyDTO;
import com.capstone.HelpService.Entities.Help;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HelpRepository extends JpaRepository<Help, Long> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Help(booking_state, ticket_id, user_name, contact_number, email,messages) VALUES\n" +
            "(?1,?2,?3,?4,?5,?6)", nativeQuery = true)
    void sendHelp(Boolean bookState, Integer ticketId, String name, String contactNumber, String email, String messages);
}
