package lt.vtvpmc.lt.ems.zp182.colorchangezp182;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textForUser;
    private  Button buttonRed;
    private  Button buttonGreen;
    private  Button buttonBlue;
    private RelativeLayout relativeLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textForUser = (TextView) findViewById(R.id.textForUser);
        buttonRed = (Button) findViewById(R.id.buttonRed);
        buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonBlue = (Button) findViewById(R.id.buttonBlue);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);



        //TODO Pataisyti koda, kad jis nesikartotu, nes jis yra perteklinis
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorRed));
                textForUser.setText("Color Red");



            }
        });
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                textForUser.setText("Color Green");



            }
        });
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                textForUser.setText("Color Blue");



            }
        });

    }
}
