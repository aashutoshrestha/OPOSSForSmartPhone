package np.com.aashutoshrestha.onlineproductorderinganddeliverysystem.Adapters;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import np.com.aashutoshrestha.onlineproductorderinganddeliverysystem.R;

public class DashboardRecyclerViewAdapter extends  RecyclerView.Adapter<DashboardRecyclerViewAdapter.DashboardViewHolder>{
    private static final String TAG  = "DRViewAdapter";

    private ArrayList<String> titles = new ArrayList<>();
    private ArrayList<String> subtitles = new ArrayList<>();
    private ArrayList<Image> images = new ArrayList<>();
    private Context mContext;

    public DashboardRecyclerViewAdapter(ArrayList<String> titles, ArrayList<String> subtitles, ArrayList<Image> images, Context mContext) {
        this.titles = titles;
        this.subtitles = subtitles;
        this.images = images;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public DashboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_dashboard_items,parent, false);

        DashboardViewHolder viewHolder = new DashboardViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder called");

        holder.titleImage.setImageResource(R.drawable.ic_profile_default_thumb);
        holder.titleText.setText(titles.get(position));
        holder.subtitleText.setText(subtitles.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener(){
                                                   @Override
                                                   public void onClick(View v) {
                                                       Log.d(TAG, "onClicked :"+titles.get(position));
                                                       Toast.makeText(mContext,titles.get(position),Toast.LENGTH_SHORT).show();
                                                   }
                                               }
        );
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class DashboardViewHolder extends RecyclerView.ViewHolder{

        ImageView titleImage;
        TextView titleText;
        TextView subtitleText;
        RelativeLayout parentLayout;

        public DashboardViewHolder(View itemView){
            super(itemView);
            titleImage = itemView.findViewById(R.id.itemTitleImage);
            titleText = itemView.findViewById(R.id.itemTitleText);
            subtitleText = itemView.findViewById(R.id.itemSubtitleText);
            parentLayout = itemView.findViewById(R.id.parentDashboardItemLayout);

        }

    }
}
