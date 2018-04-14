package in.co.matchboxmedia.noopuram;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class button_frag_draw extends Fragment {


    public button_frag_draw() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_button_frag_draw, container, false);


        Button b1=(Button)view.findViewById(R.id.button_1);
        Button b2=(Button)view.findViewById(R.id.button_2);
        Button b3=(Button)view.findViewById(R.id.button_3);
        Button b4=(Button)view.findViewById(R.id.button_4);
        Button b5=(Button)view.findViewById(R.id.button_5);
        Button b6=(Button)view.findViewById(R.id.button_6);
        Button b7=(Button)view.findViewById(R.id.button_7);
        Button b8=(Button)view.findViewById(R.id.button_8);
        Button b9=(Button)view.findViewById(R.id.button_9);
        Button b10=(Button)view.findViewById(R.id.button_10);
        Button b11=(Button)view.findViewById(R.id.button_11);
        Button b12=(Button)view.findViewById(R.id.button_12);
        Button b13=(Button)view.findViewById(R.id.button_13);
        b1.getBackground().setAlpha(64);
        b2.getBackground().setAlpha(64);
        b3.getBackground().setAlpha(64);
        b4.getBackground().setAlpha(64);
        b5.getBackground().setAlpha(64);
        b6.getBackground().setAlpha(64);
        b7.getBackground().setAlpha(64);
        b8.getBackground().setAlpha(64);
        b9.getBackground().setAlpha(64);
        b10.getBackground().setAlpha(64);
        b11.getBackground().setAlpha(64);
        b12.getBackground().setAlpha(64);
        b13.getBackground().setAlpha(64);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "painting_watercolour");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();  }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "painting_oilcolour");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();}
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "cartoon_drawing");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();}
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "pencil_drawing");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit(); }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "clay_modelling");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit(); }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "collage");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();}
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "embroidary");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit(); }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "poster_making");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit(); }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "rangoli");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();  }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "spot_photography");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit(); }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "face_emprodary");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit(); }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "mahanthi");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();  }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle=new Bundle();
                bundle.putString("name", "wall_painting");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();}
        });

        return view;
    }

}
