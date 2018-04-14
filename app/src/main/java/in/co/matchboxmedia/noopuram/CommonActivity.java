package in.co.matchboxmedia.noopuram;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

import java.util.Objects;

public class CommonActivity extends AppCompatActivity {

    private static final String TAG = CommonActivity.class.getSimpleName();
    private TextView title_of_activity;
    private Intent intent;


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        try {
            android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar2);
            toolbar.setTitle("Noopuram '18");
            setSupportActionBar(toolbar);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        } catch (Exception e) {

        }




        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/ML_TT_Leela_Bold.TTF");


        title_of_activity = findViewById(R.id.title_of_activity);


        intent = getIntent();

        title_of_activity.setText(intent.getStringExtra("class_name"));
        title_of_activity.setTypeface(custom_font);


        if (Objects.equals(intent.getStringExtra("class_name"), "മുൻനിരക്കാർ")) {
            listfragment lead_frag = new listfragment();


            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.common_act, lead_frag).commit();
        } else if (Objects.equals(intent.getStringExtra("class_name"), "നൃത്തോത്സവം")) {
            button_frag_nirth nirth_frag = new button_frag_nirth();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.common_act, nirth_frag).commit();

        } else if (Objects.equals(intent.getStringExtra("class_name"), "സംഗീതോത്സവം")) {
            button_frag_sangetha sangh_frag = new button_frag_sangetha();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.common_act, sangh_frag).commit();
        } else if (Objects.equals(intent.getStringExtra("class_name"), "സാഹിത്യോത്സവം")) {

            button_frag_sahtya frag_sahtya = new button_frag_sahtya();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.common_act, frag_sahtya).commit();


        } else if (Objects.equals(intent.getStringExtra("class_name"), "ദൃശ്യ-നാടകോത്സവം")) {
            button_frag_drama frag_drama = new button_frag_drama();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.common_act, frag_drama).commit();

        } else if (Objects.equals(intent.getStringExtra("class_name"), "ചിത്രോത്സവം")) {
            button_frag_draw frag_draw = new button_frag_draw();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.common_act, frag_draw).commit();
        }


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


}
