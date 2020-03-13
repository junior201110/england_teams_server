package com.englandteams.server

import com.englandteams.server.Models.Team
import com.englandteams.server.Repositories.TeamRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ServerApplication {
    @Bean
    fun init(repository: TeamRepository) = CommandLineRunner {
        repository.save(Team("Manchester United", 1))
        repository.save(Team("Manchester City", 2))
        repository.save(Team("Liverpol", 3))
    }
}


fun main(args: Array<String>) {
    runApplication<ServerApplication>(*args)
}
