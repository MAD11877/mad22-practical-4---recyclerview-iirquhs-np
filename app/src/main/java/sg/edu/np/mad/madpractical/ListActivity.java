package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<User> userArrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int randInt = random.nextInt(Integer.MAX_VALUE);
            String username = "Name" + randInt;
            int userID = randInt;

            randInt = random.nextInt(Integer.MAX_VALUE);
            String description = "Description " + randInt;

            User user = new User(username, description, userID, false);
            userArrayList.add(user);
        }

        RecyclerView rv = findViewById(R.id.profileRV);
        ProfileAdapter adapter = new ProfileAdapter(userArrayList);
        LinearLayoutManager layout = new LinearLayoutManager(this);

        rv.setLayoutManager(layout);
        rv.setAdapter(adapter);

    }
}