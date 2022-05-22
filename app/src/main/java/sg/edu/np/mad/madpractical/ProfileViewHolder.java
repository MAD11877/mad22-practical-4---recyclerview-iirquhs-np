package sg.edu.np.mad.madpractical;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ProfileViewHolder extends RecyclerView.ViewHolder {
    TextView username, description;
    public ProfileViewHolder(View viewItem, RecyclerViewInterface rcvInterface) {
        super(viewItem);
        username = viewItem.findViewById(R.id.username);
        description = viewItem.findViewById(R.id.userDescription);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rcvInterface != null) {
                    int position = getAdapterPosition();


                    if (position != RecyclerView.NO_POSITION) {
                        rcvInterface.onItemClick(position);
                    }
                }
            }
        });
    }
}
