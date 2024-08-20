package com.example.demo.controller;

import com.example.demo.model.Score;
import com.example.demo.service.LeaderboardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeaderboardController {
    private final LeaderboardService leaderboardService;

    public LeaderboardController(LeaderboardService leaderboardService) {
        this.leaderboardService = leaderboardService;
    }

    @GetMapping("/api/leaderboard")
    public List<Score> getTopKScores(@RequestParam int topK) {
        System.out.println(leaderboardService.getTopKScores(topK));
        return leaderboardService.getTopKScores(topK);
    }
}
