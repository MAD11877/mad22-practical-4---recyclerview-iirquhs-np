package sg.edu.np.mad.madpractical;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ProfileViewHolder extends RecyclerView.ViewHolder {
    TextView username, description;
    public ProfileViewHolder(View viewItem) {
        super(viewItem);
        username = viewItem.findViewById(R.id.username);
        description = viewItem.findViewById(R.id.userDescription);
    }
}
