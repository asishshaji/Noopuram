package in.co.matchboxmedia.noopuram;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class listfragment extends Fragment {

    private DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference points;
    private List<LeaderboardModelclass> modelclassList;
    private ListView lv;
    private leaderboardlist adapter;


    public listfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_listfragment, container, false);
        //Toast.makeText(getContext(), "Boom", Toast.LENGTH_SHORT).show();

        lv = view.findViewById(R.id.listview);

        mDatabase.keepSynced(true);
        points = mDatabase.child("points");
        points.keepSynced(true);

        modelclassList = new ArrayList<>();

        load_data();


        adapter = new leaderboardlist(getActivity(), modelclassList);


        lv.setAdapter(adapter);


//        listView.setAdapter(adapter);


        // Inflate the layout for this fragment
        return view;
    }

    private void load_data() {

        try {


            points.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {


                    modelclassList.clear();

                    //iterating through all the nodes
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {

                        LeaderboardModelclass branch = postSnapshot.getValue(LeaderboardModelclass.class);
                        modelclassList.add(branch);

                    }


                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        } catch (Exception e) {

        }

    }
}
