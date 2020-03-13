package com.englandteams.server.Models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Team(
        var name: String = "",
        var teamId: Long = 0,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0
)