package home.stanislavpoliakov.meet2_practice;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initItemAndListener();
    }

    private void initItemAndListener() {
        Button close_all_except_root_button = findViewById(R.id.close_all_except_root_button);
        close_all_except_root_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(MainActivity.newIntent(InfoActivity.this));
    }

    public static final Intent newIntent(Context context) {
        return new Intent(context, InfoActivity.class);
    }
}
