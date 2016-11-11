package com.example.macbook.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CourtCounter extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;
    private TextView teamAScoreView;
    private TextView teamBScoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);
        teamAScoreView = (TextView) findViewById(R.id.team_a_score);
        teamBScoreView = (TextView) findViewById(R.id.team_b_score);
    }

    public void displayForTeamA(int score) {
        teamAScoreView.setText(String.valueOf(score));
    }

    public void addThreeToTeamA(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void addTwoToTeamA(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void addFreeThrowToTeamA(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    public void addThreeToTeamB(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void addTwoToTeamB(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    public void addFreeThrowToTeamB(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    private void displayForTeamB(int teamBScore) {
        teamBScoreView.setText(String.valueOf(teamBScore));
    }

    public void resetScore(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
