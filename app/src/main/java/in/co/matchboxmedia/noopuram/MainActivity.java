package in.co.matchboxmedia.noopuram;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import static in.co.matchboxmedia.noopuram.R.layout.activity_main;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    private DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference points;
    private List<LeaderboardModelclass> modelclassList;

    private TextView leader, dep1, dep2, dep3, point1, point2, point3, title_nirtham, title_song, title_drama, title_drawing, title_writing;

    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        YoYo.with(Techniques.Wobble)
                .duration(500)
                .repeat(1)
                .playOn(findViewById(R.id.toolbar));


        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        naming_Navbar(navigationView);

        //fire
        mDatabase.keepSynced(true);
        points = mDatabase.child("points");
        points.keepSynced(true);

        modelclassList = new ArrayList<>();

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/ML_TT_Leela_Bold.TTF");

        leader = findViewById(R.id.leader_title);
        leader.setTypeface(custom_font);

        title_nirtham = findViewById(R.id.nirtham_text);
        title_nirtham.setTypeface(custom_font);

        title_drama = findViewById(R.id.drama_text);
        title_drama.setTypeface(custom_font);

        title_drawing = findViewById(R.id.drawing_text);
        title_drawing.setTypeface(custom_font);

        title_song = findViewById(R.id.song_text);
        title_song.setTypeface(custom_font);

        title_writing = findViewById(R.id.writing_text);
        title_writing.setTypeface(custom_font);


        dep1 = findViewById(R.id.dep1);
        dep2 = findViewById(R.id.dep2);
        dep3 = findViewById(R.id.dep3);

        point1 = findViewById(R.id.point1);
        point2 = findViewById(R.id.point2);
        point3 = findViewById(R.id.point3);

    }

    @Override
    protected void onStart() {
        super.onStart();
        points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                modelclassList.clear();
                //iterating through all the nodes
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    //getting artist

                    LeaderboardModelclass artist = postSnapshot.getValue(LeaderboardModelclass.class);
                    modelclassList.add(artist);
                    // Log.d(TAG, "onDataChange: The value " + modelclassList.get(0).getDept_name());


                    //adding artist to the list


                    // Toast.makeText(MainActivity.this, "" + artist.getDept_name(), Toast.LENGTH_SHORT).show();
                    //Log.d(TAG, "onDataChange: The points are "+modelclassList.get(0).getDept_name());
                    //  Log.d(TAG, "onDataChange: The dept are "+artist.getDept_name());


                }

                dep1.setText(modelclassList.get(0).getDept_name());
                dep2.setText(modelclassList.get(1).getDept_name());
                dep3.setText(modelclassList.get(2).getDept_name());

                point1.setText(modelclassList.get(0).getPoints());
                point2.setText(modelclassList.get(1).getPoints());
                point3.setText(modelclassList.get(2).getPoints());


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    void naming_Navbar(NavigationView navigationView) {

        Menu menu = navigationView.getMenu();
        MenuItem menuItem0 = menu.getItem(0);
        SpannableString s0 = new SpannableString("Home");
        s0.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s0.length(), 0);
        menuItem0.setTitle(s0);

        MenuItem menuItem1 = menu.getItem(1);
        SpannableString s1 = new SpannableString("Schedule");
        s1.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s1.length(), 0);
        menuItem1.setTitle(s1);

        MenuItem menuItem2 = menu.getItem(2);
        SpannableString s2 = new SpannableString("Venue");
        s2.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s2.length(), 0);
        menuItem2.setTitle(s2);

        MenuItem menuItem3 = menu.getItem(3);
        SpannableString s3 = new SpannableString("Contact Us");
        s3.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s3.length(), 0);
        menuItem3.setTitle(s3);

        MenuItem menuItem4 = menu.getItem(4);
        SpannableString s4 = new SpannableString("About");
        s4.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s4.length(), 0);
        menuItem4.setTitle(s4);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

        } else if (id == R.id.nav_schedule) {
            Intent intent=new Intent(MainActivity.this,slide_menu.class);
            startActivity(intent);
        } else if (id == R.id.nav_locate_us) {

            startActivity(new Intent(MainActivity.this,about_us.class));

        } else if (id == R.id.nav_venue) {

            startActivity(new Intent(MainActivity.this, Venue.class));

        } else if (id == R.id.nav_contact) {

            startActivity(new Intent(MainActivity.this,contact_.class));

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void load_more_list(View view) {
        Intent intent = new Intent(MainActivity.this, CommonActivity.class);
        intent.putExtra("class_name", "മുൻനിരക്കാർ");
        startActivity(intent);
    }

    public void nirth_func(View view) {
        Intent intent = new Intent(MainActivity.this, CommonActivity.class);
        intent.putExtra("class_name", "നൃത്തോത്സവം");
        startActivity(intent);
    }

    public void song_func(View view) {
        Intent intent = new Intent(MainActivity.this, CommonActivity.class);
        intent.putExtra("class_name", "സംഗീതോത്സവം");
        startActivity(intent);
    }

    public void drama_func(View view) {
        Intent intent = new Intent(MainActivity.this, CommonActivity.class);
        intent.putExtra("class_name", "ദൃശ്യ-നാടകോത്സവം");
        startActivity(intent);
    }

    public void draw_func(View view) {
        Intent intent = new Intent(MainActivity.this, CommonActivity.class);
        intent.putExtra("class_name", "ചിത്രോത്സവം");
        startActivity(intent);
    }

    public void writing_func(View view) {
        Intent intent = new Intent(MainActivity.this, CommonActivity.class);
        intent.putExtra("class_name", "സാഹിത്യോത്സവം");
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.share_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.share) {
            try {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(android.content.Intent.EXTRA_TEXT, " 1: " + modelclassList.get(0).getDept_name() + "  " + modelclassList.get(0).getPoints() + "\n" + " 2: " + modelclassList.get(1).getDept_name() + "  " + modelclassList.get(1).getPoints() + "\n" + " 3: " + modelclassList.get(2).getDept_name() + "  " + modelclassList.get(2).getPoints() + "\n" + " 4: " + modelclassList.get(3).getDept_name() + "  " + modelclassList.get(3).getPoints() + "\n" + " 5: " + modelclassList.get(4).getDept_name() + "  " + modelclassList.get(4).getPoints() + "\n" + " 6: " + modelclassList.get(5).getDept_name() + "  " + modelclassList.get(5).getPoints() + "\n" + "\n" + "Shared via Noopuram '18" + "\n" );
                startActivity(Intent.createChooser(intent, "Share via"));

            } catch (Exception e) {

            }

        }
        return super.onOptionsItemSelected(item);
    }
}