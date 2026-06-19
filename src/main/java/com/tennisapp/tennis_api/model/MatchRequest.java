package com.tennisapp.tennis_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class MatchRequest {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "match_req_id", nullable = false)
    private Long id;
}
