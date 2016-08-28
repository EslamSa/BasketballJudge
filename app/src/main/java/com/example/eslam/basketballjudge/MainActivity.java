package com.example.eslam.basketballjudge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_about) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void restScore(View view) {
        Toast.makeText(getApplicationContext(), "Scores Reset", Toast.LENGTH_LONG).show();
        teamAScore = 0;
        teamBScore = 0;
        displayTeamAScore(teamAScore);
        displayTeamBScore(teamBScore);
    }

    public void incrementteamAbyone(View view) {
        teamAScore += 1;
        displayTeamAScore(teamAScore);
    }

    public void incrementTeamBbyone(View view) {
        teamBScore += 1;
        displayTeamBScore(teamBScore);
    }

    public void incrementTeamAbytwo(View view) {
        teamAScore += 2;
        displayTeamAScore(teamAScore);
    }

    public void incrementTeamBbytwo(View view) {
        teamBScore += 2;
        displayTeamBScore(teamBScore);
    }

    public void incrementTeamAbythree(View view) {
        teamAScore += 3;
        displayTeamAScore(teamAScore);
    }

    public void incrementTeamBbythree(View view) {
        teamBScore += 3;
        displayTeamBScore(teamBScore);
    }

    public void displayTeamAScore(int teamAScore) {
        TextView teamAScoreTextView = (TextView) findViewById(R.id.team_a);
        teamAScoreTextView.setText(String.valueOf(teamAScore));
    }

    public void displayTeamBScore(int teamBScore) {
        TextView teamBScoreTextView = (TextView) findViewById(R.id.team_b);
        teamBScoreTextView.setText(String.valueOf(teamBScore));
    }

}
