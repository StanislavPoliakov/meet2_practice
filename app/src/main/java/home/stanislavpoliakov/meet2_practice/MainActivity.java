package home.stanislavpoliakov.meet2_practice;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initItemAndListener();
    }

    private void initItemAndListener(){
        Button splash_activity_button = findViewById(R.id.splash_activity_button);
        splash_activity_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(SplashActivity.newIntent(MainActivity.this));
    }

    public final static Intent newIntent(Context context) {
        return new Intent(context, MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    }
}
