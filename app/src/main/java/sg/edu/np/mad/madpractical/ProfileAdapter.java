package sg.edu.np.mad.madpractical;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileViewHolder> {
    private final RecyclerViewInterface rcvInterface;
    ArrayList<User> data;
    ListActivity listActivity;

    public ProfileAdapter(ArrayList<User> data, RecyclerViewInterface rcvInterface) {

        this.data = data;
        this.rcvInterface = rcvInterface;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_list, null, false);
        return new ProfileViewHolder(item, rcvInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        User user = data.get(position);
        holder.username.setText(user.getName());
        holder.description.setText(user.getDescription());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
