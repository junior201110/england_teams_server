package com.englandteams.server.Controllers

import com.englandteams.server.Repositories.TeamRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/teams")
class TeamsController(val repository: TeamRepository) {
    @GetMapping
    fun findAll() = repository.findAll()
}