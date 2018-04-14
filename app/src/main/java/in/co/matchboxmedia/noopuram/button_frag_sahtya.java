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
public class button_frag_sahtya extends Fragment {


    public button_frag_sahtya() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_button_frag_sahtya, container, false);


        Button b1 = view.findViewById(R.id.button_1);
        Button b2 = view.findViewById(R.id.button_2);
        Button b3 = view.findViewById(R.id.button_3);
        Button b4 = view.findViewById(R.id.button_4);
        Button b5 = view.findViewById(R.id.button_5);
        Button b6 = view.findViewById(R.id.button_6);
        Button b7 = view.findViewById(R.id.button_7);
        Button b8 = view.findViewById(R.id.button_8);
        Button b9 = view.findViewById(R.id.button_9);
        b1.getBackground().setAlpha(64);
        b2.getBackground().setAlpha(64);
        b3.getBackground().setAlpha(64);
        b4.getBackground().setAlpha(64);
        b5.getBackground().setAlpha(64);
        b6.getBackground().setAlpha(64);
        b7.getBackground().setAlpha(64);
        b8.getBackground().setAlpha(64);
        b9.getBackground().setAlpha(64);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lang_frag fragment = new lang_frag();
                Bundle bundle = new Bundle();
                bundle.putString("name", "prabanda_rajana-");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lang_frag fragment = new lang_frag();
                Bundle bundle = new Bundle();
                bundle.putString("name", "cheru_kadha-");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lang_frag fragment = new lang_frag();
                Bundle bundle = new Bundle();
                bundle.putString("name", "kavitha_rajana-");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lang_frag fragment = new lang_frag();
                Bundle bundle = new Bundle();
                bundle.putString("name", "prasangam-");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", "quiz");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", "debate");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", "akshara_slogam");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", "just_a_minute");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", "kavya_keli");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });

        return view;
    }

}
