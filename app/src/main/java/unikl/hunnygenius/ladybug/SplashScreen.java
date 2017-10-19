package unikl.hunnygenius.ladybug;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private TextView welcome;
    private ImageView ladybug;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ladybug = (ImageView)findViewById(R.id.ladybug);
        welcome = (TextView)findViewById(R.id.welcome);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        welcome.startAnimation(myanim);
        ladybug.startAnimation(myanim);
        final Intent i = new Intent(this,MainPage.class);
        Thread timer =new Thread(){
            public void run(){
                try{
                    sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }

                finally {
                    startActivity(i);
                    finish();
                }
            }
        };

        timer.start();
    }
}
