package th.ac.krirk.ball.mydice;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView ImageView,androidImageView;
    private Button backButton,RandomButton, nextButton;
    private int intdice = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind widget
        bindWidget();

        // Back Controller
        backController();

        // Rock controller
        randomController();

        // Scissor controller
        nextController();


    }


    private void showview(int intdice) {
        Log.d("test", "ค่าที่ได้รับ = " + intdice);
        int intSoure;
        switch (intdice) {
            case 1:
                ImageView.setImageResource(R.drawable.dice1);
                break;
            case 2:
                ImageView.setImageResource(R.drawable.dice2);
                break;
            case 3:
                ImageView.setImageResource(R.drawable.dice3);
                break;
            case 4:
                ImageView.setImageResource(R.drawable.dice4);
                break;
            case 5:
                ImageView.setImageResource(R.drawable.dice5);
                break;
            case 6:
                ImageView.setImageResource(R.drawable.dice6);
                break;
        }
        MediaPlayer imagMediaPlayer = MediaPlayer.create(getBaseContext(), intSoure);
        imagMediaPlayer.start();

    }

    private void myrandomPicture(int intUser) {
        int myRandom = 0;
        Random objRandom = new Random();
        myRandom = objRandom.nextInt(6) + 1;
        Log.d("Ran", "myRandom ==>" + myRandom);

        diceview(myRandom);
    }

    private void nextController() {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intdice += 1;
                if (intdice == 0) {
                    intdice = 7;
                }
                showview(intdice);

            }
        });
    }

    private void randomController() {
        RandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void backController() {
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intdice -= 1;
                if (intdice == 0) {
                    intdice = 7;
                }
                showview(intdice);
            }
        });
    }

    private void bindWidget() {
        ImageView = (android.widget.ImageView) findViewById(R.id.imageView);
        backButton = (Button) findViewById(R.id.button);
        RandomButton = (Button) findViewById(R.id.button3);
        nextButton = (Button) findViewById(R.id.Random);
    }

    private void diceview(int intMyRandom) {
            int[] intSourceImage = new int[7];
            intSourceImage[0] = 0;
            intSourceImage[1] = R.drawable.dice1;
            intSourceImage[2] = R.drawable.dice2;
            intSourceImage[3] = R.drawable.dice3;
            intSourceImage[4] = R.drawable.dice4;
            intSourceImage[5] = R.drawable.dice5;
            intSourceImage[6] = R.drawable.dice6;

            androidImageView.setImageResource(intSourceImage[intMyRandom]);

    }
}
