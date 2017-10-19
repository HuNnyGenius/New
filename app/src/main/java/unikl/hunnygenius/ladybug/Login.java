package unikl.hunnygenius.ladybug;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /** Called when the user taps the Send button */
    public void login (View view) {
        Intent intent = new Intent(this, NewHome.class);
        startActivity(intent);
    }
}
