package com.example.demo.service;

import com.example.demo.model.Score;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LeaderboardService {
    private final List<Score> scores;

    public LeaderboardService() {
        // Mock data for now
        scores = new ArrayList<>();
        scores.add(new Score("Alice", 95));
        scores.add(new Score("Bob", 89));
        scores.add(new Score("Charlie", 85));
        scores.add(new Score("David", 82));
        scores.add(new Score("Eva", 80));
    }

    public List<Score> getTopKScores(int k) {
        System.out.println("Call in service");
        return scores.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getPoints(), s1.getPoints()))
                .limit(k)
                .collect(Collectors.toList());
    }
}
