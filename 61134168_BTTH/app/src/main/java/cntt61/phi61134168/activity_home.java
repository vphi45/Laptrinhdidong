package cntt61.phi61134168;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_home extends AppCompatActivity {
    TextView showdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        showdata = findViewById(R.id.tvUserName);
        showdata.setText(getIntent().getStringExtra("data"));
    }
}