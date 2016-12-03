package com.example.abhishekyadav.abhiguitar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class First extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        b1=(Button) findViewById(R.id.Button1);
        b2=(Button) findViewById(R.id.Button2);
        b3=(Button) findViewById(R.id.Button3);
        b4=(Button) findViewById(R.id.Button4);

        b5=(Button) findViewById(R.id.Button5);

        b6=(Button) findViewById(R.id.Button6);



    }

   public void onClick(View v)
    {
        if(v.getId()==R.id.Button1)
        {
            MediaPlayer a = MediaPlayer.create(this,R.raw.sound1);
            a.start();
        }
        else if (v.getId()==R.id.Button2)
        {
            MediaPlayer b = MediaPlayer.create(this,R.raw.sound2);
            b.start();
        }

        else if (v.getId()==R.id.Button3)
        {
            MediaPlayer c = MediaPlayer.create(this,R.raw.sound3);
            c.start();
        }
        else if (v.getId()==R.id.Button4)
        {
            MediaPlayer d = MediaPlayer.create(this,R.raw.sound4);
            d.start();
        }
        else if (v.getId()==R.id.Button5)
        {
            MediaPlayer f = MediaPlayer.create(this,R.raw.sound5);
            f.start();
        }
        else if (v.getId()==R.id.Button6)
        {
            MediaPlayer g = MediaPlayer.create(this,R.raw.sound6);
            g.start();
        }
    }
}
