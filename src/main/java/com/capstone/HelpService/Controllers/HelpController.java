package com.capstone.HelpService.Controllers;

import com.capstone.HelpService.DTOs.HelpRequestBodyDTO;
import com.capstone.HelpService.DTOs.ResponseStatus;
import com.capstone.HelpService.Services.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/help")
public class HelpController {
    final HelpService helpService;

    @Autowired
    public HelpController(HelpService helpService) {
        this.helpService = helpService;
    }

    @PostMapping("/sendHelp")
    public ResponseStatus userSendHelp(@RequestBody HelpRequestBodyDTO helpContent){
        return helpService.sendHelp(helpContent);
    }
}
