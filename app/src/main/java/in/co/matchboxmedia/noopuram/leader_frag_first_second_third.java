package in.co.matchboxmedia.noopuram;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class leader_frag_first_second_third extends Fragment {

    private TextView dep1, dep2, dep3, point1, point2, point3;
    private DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference databaseReference;
    private List<LeaderboardModelclass> modelclassList;


    public leader_frag_first_second_third() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_leader_frag_first_second_third, container, false);






        String db_name = getArguments().getString("name");


        mDatabase.keepSynced(true);
        databaseReference = mDatabase.child(db_name);
        databaseReference.keepSynced(true);


        dep1 = view.findViewById(R.id.branch_name1);
        dep2 = view.findViewById(R.id.branch_name2);
        dep3 = view.findViewById(R.id.branch_name3);

        point1 = view.findViewById(R.id.points1);
        point2 = view.findViewById(R.id.points2);
        point3 = view.findViewById(R.id.points3);

        modelclassList = new ArrayList<>();

        load_data();


        return view;
    }

    private void load_data() {

        try {


            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {

                    //clearing the previous artist list
                    modelclassList.clear();
                    //iterating through all the nodes
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {

                        LeaderboardModelclass branch = postSnapshot.getValue(LeaderboardModelclass.class);
                        modelclassList.add(branch);


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


        } catch (Exception e) {

        }

    }

}
