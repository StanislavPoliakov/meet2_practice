package home.stanislavpoliakov.meet2_practice;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initItemAndListener();
    }

    private void initItemAndListener() {
        Button info_activity_button = findViewById(R.id.info_activity_button);
        info_activity_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(InfoActivity.newIntent(DetailsActivity.this));
    }

    public static final Intent newIntent(Context context) {
        return new Intent(context, DetailsActivity.class);
    }
}
