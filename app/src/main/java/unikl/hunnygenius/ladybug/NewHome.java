package unikl.hunnygenius.ladybug;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NewHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_home);
    }

    public void outbound (View view){
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }

    public void syntax (View view){

        
    }
}
