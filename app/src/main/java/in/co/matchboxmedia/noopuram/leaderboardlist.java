package in.co.matchboxmedia.noopuram;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by mrkai on 11/3/18.
 */

public class leaderboardlist extends ArrayAdapter<LeaderboardModelclass>{

    private Activity mContext;
    private List<LeaderboardModelclass> modelclassList;
    private TextView dept,points;
    private LinearLayout layout;



    public leaderboardlist(Activity mContext, List<LeaderboardModelclass> modelclassList) {
        super(mContext, R.layout.listview_custom_points, modelclassList);
        this.mContext = mContext;
        this.modelclassList = modelclassList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = mContext.getLayoutInflater();
        @SuppressLint("ViewHolder") View view = inflater.inflate(R.layout.listview_custom_points,null,true);

        layout = view.findViewById(R.id.lin);
        dept = view.findViewById(R.id.branch_name);
        points = view.findViewById(R.id.points);


        dept.getBackground().setAlpha(64);
        points.getBackground().setAlpha(64);
        layout.getBackground().setAlpha(64);

        dept.setText(modelclassList.get(position).getDept_name());
        points.setText(modelclassList.get(position).getPoints());



        //
       // Log.d("Imp", "getView: "+modelclass.getPoints().getClass());
        return view;
    }
}
