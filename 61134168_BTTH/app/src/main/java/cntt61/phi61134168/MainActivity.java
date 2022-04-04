package cntt61.phi61134168;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // gọi biến vào id btn bên giao diện id =/btnLogin
        button = findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Chuyen qua activity_login( Giao dien dangnhap)
                Intent intent = new Intent(MainActivity.this, activity_login.class);
                startActivity(intent);

            }
        });
    }
}