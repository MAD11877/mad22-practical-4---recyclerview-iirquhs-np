package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity implements RecyclerViewInterface {
    ArrayList<User> userArrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

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
        ProfileAdapter adapter = new ProfileAdapter(userArrayList, this);
        LinearLayoutManager layout = new LinearLayoutManager(this);

        rv.setLayoutManager(layout);
        rv.setAdapter(adapter);

    }

    @Override
    public void onItemClick(int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);


        builder.setTitle("Profile")
                .setMessage(userArrayList.get(position).getName())
                .setPositiveButton("VIEW", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent (ListActivity.this, MainActivity.class);

                        intent.putExtra("POSITION", position);
                        intent.putExtra("USERNAME", userArrayList.get(position).getName());
                        intent.putExtra("DESCRIPTION", userArrayList.get(position).getDescription());

                        startActivity(intent);
                    }
                })
                .setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .show();


    }
}