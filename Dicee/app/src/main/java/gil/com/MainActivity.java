package gil.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.RollButton);

        final ImageView leftDice;
        leftDice = (ImageView) findViewById(R.id.image_leftDice);

        final ImageView rightDice;
        rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                           R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int num = rand.nextInt(6);
                leftDice.setImageResource(diceArray[num]);
                num = rand.nextInt(6);
                rightDice.setImageResource(diceArray[num]);
            }
        });


    }
}
