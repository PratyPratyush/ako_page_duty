package com.ako.pageduty.controller;

import com.ako.pageduty.model.RequestObject;
import com.ako.pageduty.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PagerController {
    // ---a
        //- b
        // - c
     //--> b
        // - d
    // c
    @Autowired
    TeamService teamService;

    @RequestMapping(value="/create", method=RequestMethod.POST)
    public ResponseEntity<?> insertDeveloper(@RequestBody RequestObject request){
        try {
            teamService.insertTeamInfo(request);
        }catch (Exception e){
            return new ResponseEntity<>("FAILED", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Success", HttpStatus.ACCEPTED);
    }
}
