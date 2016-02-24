package th.ac.krirk.ball.mydice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ImageView;
    private Button backButton,RandomButton, nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bindWidget();
    }

    private void bindWidget() {
        ImageView = (android.widget.ImageView) findViewById(R.id.imageView);
        backButton = (Button) findViewById(R.id.button);
        RandomButton = (Button) findViewById(R.id.button3);
        nextButton = (Button) findViewById(R.id.Random);
    }
}
