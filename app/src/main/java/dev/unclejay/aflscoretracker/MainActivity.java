package dev.unclejay.aflscoretracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* Declare global variables needed */
    int pointsHome = 0;
    int pointsAway = 0;
    int goalsHome = 0;
    int goalsAway = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Add point for Home team and update home score */
    public void scorePointHome(View v) {
        pointsHome = pointsHome + 1;
        showScoreHome();
    }

    /* Add goal for Home team and update home score */
    public void scoreGoalHome(View v) {
        goalsHome = goalsHome + 1;
        showScoreHome();
    }

    /* Show the Home teams points, goals and overall score */
    private void showScoreHome() {

        int scoreHome = pointsHome + goalsHome * 6;
        TextView scoreTotal = (TextView) findViewById(R.id.scoreHome);
        scoreTotal.setText(String.valueOf(scoreHome));

        TextView scorePoint = (TextView) findViewById(R.id.pointHome);
        scorePoint.setText(String.valueOf(pointsHome));

        TextView scoreGoal = (TextView) findViewById(R.id.goalHome);
        scoreGoal.setText(String.valueOf(goalsHome));

    }

    /* Add point for Away team and update away score */
    public void scorePointAway(View v) {
        pointsAway = pointsAway + 1;
        showScoreAway();
    }

    /* Add goal for Away team and update away score */
    public void scoreGoalAway(View v) {
        goalsAway = goalsAway + 1;
        showScoreAway();
    }

    /* Show the Away teams points, goals and overall score */
    private void showScoreAway() {

        int scoreAway = pointsAway + goalsAway * 6;
        TextView scoreTotal = (TextView) findViewById(R.id.scoreAway);
        scoreTotal.setText(String.valueOf(scoreAway));

        TextView scorePoint = (TextView) findViewById(R.id.pointAway);
        scorePoint.setText(String.valueOf(pointsAway));

        TextView scoreGoal = (TextView) findViewById(R.id.goalAway);
        scoreGoal.setText(String.valueOf(goalsAway));

    }

    /* Reset the scores for both teams and update the display */
    public void newGame(View v) {

        pointsHome = 0;
        pointsAway = 0;
        goalsHome = 0;
        goalsAway = 0;

        showScoreHome();
        showScoreAway();

    }

}