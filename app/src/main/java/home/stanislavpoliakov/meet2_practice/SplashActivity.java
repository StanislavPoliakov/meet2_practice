package home.stanislavpoliakov.meet2_practice;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initItemAndListener();
    }

    private void initItemAndListener() {
        Button details_activity_button = findViewById(R.id.details_activity_button);
        details_activity_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(DetailsActivity.newIntent(SplashActivity.this));
    }

    public static final Intent newIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }
}
