package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        int position = intent.getIntExtra("POSITION", 0);
        String username = intent.getStringExtra("USERNAME");
        String description = intent.getStringExtra("DESCRIPTION");

        TextView profileName = findViewById(R.id.profileName);
        profileName.setText(username);

        TextView profileDesc = findViewById(R.id.profileDesc);
        profileDesc.setText(description);

        Button followBtn = findViewById(R.id.button4);
        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = followBtn.getText().toString();
                if (text == "FOLLOW") {
                    followBtn.setText("UNFOLLOW");
                    Toast.makeText(MainActivity.this, "Followed", Toast.LENGTH_SHORT).show();
                }
                else {
                    followBtn.setText("FOLLOW");
                    Toast.makeText(MainActivity.this, "Unfollowed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button msgButton = findViewById(R.id.button3);
        msgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}