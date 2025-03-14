package com.example.journalApp.controller;

import com.example.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_journal")
public class JournalEntryControllerV2 {


    @GetMapping
    public List<JournalEntry> getAll(){

        return List.of();
    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){

        return true;
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){


        return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId){

        return null;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long id,@RequestBody JournalEntry myEntry){

        return myEntry;
    }
}
