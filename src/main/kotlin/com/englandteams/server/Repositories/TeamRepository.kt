package com.englandteams.server.Repositories

import com.englandteams.server.Models.Team
import org.springframework.data.repository.CrudRepository

interface TeamRepository : CrudRepository<Team, Long> {
}