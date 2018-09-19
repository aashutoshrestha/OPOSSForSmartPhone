package np.com.aashutoshrestha.onlineproductorderinganddeliverysystem.UI;

import android.media.Image;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.aashutoshrestha.onlineproductorderinganddeliverysystem.Adapters.DashboardRecyclerViewAdapter;
import np.com.aashutoshrestha.onlineproductorderinganddeliverysystem.R;
public class DashboardActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ActionBarDrawerToggle mToggle;
    private DrawerLayout mDrawerLayout;


    private ArrayList<String> titles = new ArrayList<>();
    private ArrayList<String> subtitles = new ArrayList<>();
    private ArrayList<Image> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
//        toolbar.setLogo(R.drawable.ic_launcher_background);

        mDrawerLayout = findViewById(R.id.drawer_Dashboard);
        mToggle = new ActionBarDrawerToggle (this,mDrawerLayout,toolbar,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initDatas();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initDatas(){
        titles.add("This is a new add that can be retrieved");
        subtitles.add("This is a new subtitle text that describes all the features that are available for the ad that has been provided");

        titles.add("This is a new add that can be retrieved");
        subtitles.add("This is a new subtitle text that describes all the features that are available for the ad that has been provided");

        titles.add("This is a new add that can be retrieved");
        subtitles.add("This is a new subtitle text that describes all the features that are available for the ad that has been provided");

        titles.add("This is a new add that can be retrieved");
        subtitles.add("This is a new subtitle text that describes all the features that are available for the ad that has been provided");

        titles.add("This is a new add that can be retrieved");
        subtitles.add("This is a new subtitle text that describes all the features that are available for the ad that has been provided");

        titles.add("This is a new add that can be retrieved");
        subtitles.add("This is a new subtitle text that describes all the features that are available for the ad that has been provided");

        titles.add("This is a new add that can be retrieved");
        subtitles.add("This is a new subtitle text that describes all the features that are available for the ad that has been provided");

        titles.add("This is a new add that can be retrieved");
        subtitles.add("This is a new subtitle text that describes all the features that are available for the ad that has been provided");


        initDashboard();
    }

    private void initDashboard(){
        RecyclerView recyclerView = findViewById(R.id.dashboardRecyclerView);
        DashboardRecyclerViewAdapter adapter = new DashboardRecyclerViewAdapter(titles,subtitles,images,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
