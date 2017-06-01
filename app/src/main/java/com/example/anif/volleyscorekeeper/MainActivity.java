package com.example.anif.volleyscorekeeper;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    ImageButton firstTeamPlus, firstTeamMin, secondTeamPlus, secondTeamMin;

    Button resetButton;

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

        resetButton = (Button) findViewById(R.id.resetButton);

        firstTeamScore = (TextView) findViewById(R.id.firstTeamScore);
        firstTeamServiceStatus = (TextView) findViewById(R.id.firstTeamServiceStatus);
        secondTeamScore = (TextView) findViewById(R.id.secondTeamScore);
        secondTeamServiceStatus = (TextView) findViewById(R.id.secondTeamServiceStatus);

        firstTeamPlus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (score1 < 50)
                {
                    score1 += 1;
                    firstTeamScore.setText(String.valueOf(score1));
                    firstTeamServiceStatus.setTypeface(null, Typeface.BOLD);

                    firstTeamServiceStatus.setTextSize(20);
                    secondTeamServiceStatus.setTypeface(null, Typeface.NORMAL);
                    secondTeamServiceStatus.setTextSize(16);
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

        secondTeamPlus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (score2 < 50)
                {
                    score2 += 1;
                    secondTeamScore.setText(String.valueOf(score2));
                    secondTeamServiceStatus.setTypeface(null, Typeface.BOLD);
                    secondTeamServiceStatus.setTextSize(20);
                    firstTeamServiceStatus.setTypeface(null, Typeface.NORMAL);
                    firstTeamServiceStatus.setTextSize(16);
                }
            }
        });

        secondTeamMin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (score2 > 0)
                {
                    score2 -= 1;
                    secondTeamScore.setText(String.valueOf(score2));
                }
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                score1 = 0;
                score2 = 0;
                firstTeamScore.setText("0");
                secondTeamScore.setText("0");
                secondTeamServiceStatus.setTypeface(null, Typeface.NORMAL);
                secondTeamServiceStatus.setTextSize(16);
                firstTeamServiceStatus.setTypeface(null, Typeface.NORMAL);
                firstTeamServiceStatus.setTextSize(16);
            }
        });
    }
}
