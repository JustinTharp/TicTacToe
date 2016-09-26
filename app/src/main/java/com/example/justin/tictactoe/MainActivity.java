package com.example.justin.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    Button button1A,button2A, button3A, button1B, button2B, button3B, button1C, button2C, button3C;

    int playerturn;
    int drawcounter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerturn=1;


        button1A = (Button) findViewById(R.id.button1A);
        button1A.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(button1A.getText().toString().equals(" "))
                {
                    if(playerturn == 1)
                    {
                        playerturn=2;
                        button1A.setText("O");
                    }
                    else if(playerturn ==2)
                    {
                        playerturn=1;
                        button1A.setText("X");
                    }
                }
                button1A.setClickable(false);
                button1A.setBackgroundColor(Color.LTGRAY);
                drawcounter++;
                evaluateWinner();
            }

        });

        button2A = (Button) findViewById(R.id.button2A);
        button2A.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(button2A.getText().toString().equals(" "))
                {
                    if(playerturn == 1)
                    {
                        playerturn=2;
                        button2A.setText("O");
                    }
                    else if(playerturn ==2)
                    {
                        playerturn=1;
                        button2A.setText("X");
                    }
                }
                button2A.setClickable(false);
                button2A.setBackgroundColor(Color.LTGRAY);
                drawcounter++;
                evaluateWinner();
            }

        });

        button3A = (Button) findViewById(R.id.button3A);
        button3A.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(button3A.getText().toString().equals(" "))
                {
                    if(playerturn == 1)
                    {
                        playerturn=2;
                        button3A.setText("O");
                    }
                    else if(playerturn ==2)
                    {
                        playerturn=1;
                        button3A.setText("X");
                    }
                }
                button3A.setClickable(false);
                button3A.setBackgroundColor(Color.LTGRAY);
                drawcounter++;
                evaluateWinner();
            }

        });

        button1B = (Button) findViewById(R.id.button1B);
        button1B.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(button1B.getText().toString().equals(" "))
                {
                    if(playerturn == 1)
                    {
                        playerturn=2;
                        button1B.setText("O");
                    }
                    else if(playerturn ==2)
                    {
                        playerturn=1;
                        button1B.setText("X");
                    }
                }
                button1B.setClickable(false);
                button1B.setBackgroundColor(Color.LTGRAY);
                drawcounter++;
                evaluateWinner();
            }

        });

        button2B = (Button) findViewById(R.id.button2B);
        button2B.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(button2B.getText().toString().equals(" "))
                {
                    if(playerturn == 1)
                    {
                        playerturn=2;
                        button2B.setText("O");
                    }
                    else if(playerturn ==2)
                    {
                        playerturn=1;
                        button2B.setText("X");
                    }
                }
                button2B.setClickable(false);
                button2B.setBackgroundColor(Color.LTGRAY);
                drawcounter++;
                evaluateWinner();
            }

        });

        button3B = (Button) findViewById(R.id.button3B);
        button3B.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(button3B.getText().toString().equals(" "))
                {
                    if(playerturn == 1)
                    {
                        playerturn=2;
                        button3B.setText("O");
                    }
                    else if(playerturn ==2)
                    {
                        playerturn=1;
                        button3B.setText("X");
                    }
                }
                button3B.setClickable(false);
                button3B.setBackgroundColor(Color.LTGRAY);
                drawcounter++;
                evaluateWinner();
            }

        });

        button1C = (Button) findViewById(R.id.button1C);
        button1C.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(button1C.getText().toString().equals(" "))
                {
                    if(playerturn == 1)
                    {
                        playerturn=2;
                        button1C.setText("O");
                    }
                    else if(playerturn ==2)
                    {
                        playerturn=1;
                        button1C.setText("X");
                    }
                }
                button1C.setClickable(false);
                button1C.setBackgroundColor(Color.LTGRAY);
                drawcounter++;
                evaluateWinner();
            }

        });

        button2C = (Button) findViewById(R.id.button2C);
        button2C.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(button2C.getText().toString().equals(" "))
                {
                    if(playerturn == 1)
                    {
                        playerturn=2;
                        button2C.setText("O");
                    }
                    else if(playerturn ==2)
                    {
                        playerturn=1;
                        button2C.setText("X");
                    }
                }
                button2C.setClickable(false);
                button2C.setBackgroundColor(Color.LTGRAY);
                drawcounter++;
                evaluateWinner();
            }

        });

        button3C = (Button) findViewById(R.id.button3C);
        button3C.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(button3C.getText().toString().equals(" "))
                {
                    if(playerturn == 1)
                    {
                        playerturn=2;
                        button3C.setText("O");
                    }
                    else if(playerturn ==2)
                    {
                        playerturn=1;
                        button3C.setText("X");
                    }
                }
                button3C.setClickable(false);
                button3C.setBackgroundColor(Color.LTGRAY);
                drawcounter++;
                evaluateWinner();
            }

        });
    }

    public void evaluateWinner()
    {
        String A1, A2, A3, B1, B2, B3, C1, C2, C3;
        A1 = button1A.getText().toString();
        A2 = button2A.getText().toString();
        A3 = button3A.getText().toString();
        B1 = button1B.getText().toString();
        B2 = button2B.getText().toString();
        B3 = button3B.getText().toString();
        C1 = button1C.getText().toString();
        C2 = button2C.getText().toString();
        C3 = button3C.getText().toString();

        if (A1.equals("O") && A2.equals("O") && A3.equals("O"))
        {
            Toast.makeText(MainActivity.this, "O Wins!", Toast.LENGTH_LONG).show();
            gameOver();
        }
        else if (A1.equals("X") && A2.equals("X") && A3.equals("X"))
        {
            Toast.makeText(MainActivity.this, "X Wins!", Toast.LENGTH_LONG).show();
            gameOver();
        }
        else if (A1.equals("O") && B2.equals("O") && C3.equals("O"))
        {
            Toast.makeText(MainActivity.this, "O Wins!", Toast.LENGTH_LONG).show();
            gameOver();
        }
        else if (A1.equals("X") && B2.equals("X") && C3.equals("X"))
        {
            Toast.makeText(MainActivity.this, "X Wins!", Toast.LENGTH_LONG).show();
            gameOver();
        }
        else if (A1.equals("O") && B1.equals("O") && C1.equals("O"))
        {
            Toast.makeText(MainActivity.this, "O Wins!", Toast.LENGTH_LONG).show();
            gameOver();
        }
        else if (A1.equals("X") && B1.equals("X") && C1.equals("X"))
        {
            Toast.makeText(MainActivity.this, "X Wins!", Toast.LENGTH_LONG).show();
            gameOver();
        }
        else if (B1.equals("O") && B2.equals("O") && B3.equals("O"))
        {
            Toast.makeText(MainActivity.this, "O Wins!", Toast.LENGTH_LONG).show();
            gameOver();
        }
        else if (B1.equals("X") && B2.equals("X") && B3.equals("X"))
        {
            Toast.makeText(MainActivity.this, "X Wins!", Toast.LENGTH_LONG).show();
            gameOver();
        }
        else if (C1.equals("O") && C2.equals("O") && C3.equals("O"))
        {
            Toast.makeText(MainActivity.this, "O Wins!", Toast.LENGTH_LONG).show();
            gameOver();
        }
        else if (C1.equals("X") && C2.equals("X") && C3.equals("X"))
        {
            Toast.makeText(MainActivity.this, "X Wins!", Toast.LENGTH_LONG).show();
            gameOver();
        }
        else if (C1.equals("O") && B2.equals("O") && A3.equals("O"))
        {
            Toast.makeText(MainActivity.this, "O Wins!", Toast.LENGTH_LONG).show();
            gameOver();
        }
        else if (C1.equals("X") && B2.equals("X") && A3.equals("X"))
        {
            Toast.makeText(MainActivity.this, "X Wins!", Toast.LENGTH_LONG).show();
            gameOver();
        }
        else if (drawcounter==9)
        {
            Toast.makeText(MainActivity.this, "It's a draw!", Toast.LENGTH_LONG).show();
            gameOver();
        }

    }
    public void gameOver()
    {
        button1A.setClickable(false);
        button2A.setClickable(false);
        button3A.setClickable(false);
        button1B.setClickable(false);
        button2B.setClickable(false);
        button3B.setClickable(false);
        button1C.setClickable(false);
        button2C.setClickable(false);
        button3C.setClickable(false);
    }
}
