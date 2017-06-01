package com.example.anif.volleyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    ImageButton firstTeamPlus, firstTeamMin, secondTeamPlus, secondTeamMin;

    TextView firstTeamScore, secondTeamScore, firstTeamServiceStatus, secondTeamServiceStatus;

    int score1 = 0,
        score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstTeamPlus = (ImageButton) findViewById(R.id.firstTeamScorePlus);
        firstTeamMin = (ImageButton) findViewById(R.id.firstTeamScoreMin);
        secondTeamPlus = (ImageButton) findViewById(R.id.secondTeamScorePlus);
        secondTeamMin = (ImageButton) findViewById(R.id.secondTeamScoreMin);

        firstTeamScore = (TextView) findViewById(R.id.firstTeamScore);
        firstTeamServiceStatus = (TextView) findViewById(R.id.firstTeamServiceStatus);
        secondTeamScore = (TextView) findViewById(R.id.secondTeamScore);
        secondTeamServiceStatus = (TextView) findViewById(R.id.secondTeamServiceStatus);

        firstTeamPlus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (score1 < 25)
                {
                    score1 += 1;
                    firstTeamScore.setText(String.valueOf(score1));
                }
            }
        });

        firstTeamMin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (score1 > 0)
                {
                    score1 -= 1;
                    firstTeamScore.setText(String.valueOf(score1));
                }
            }
        });
    }
}
