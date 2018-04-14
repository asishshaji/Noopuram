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
public class lang_frag extends Fragment {


    public lang_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lang_frag, container, false);

        final String db_name = getArguments().getString("name");

        Button b1 = (Button) view.findViewById(R.id.button_1);
        Button b2 = (Button) view.findViewById(R.id.button_2);
        Button b3 = (Button) view.findViewById(R.id.button_3);
        Button b4 = (Button) view.findViewById(R.id.button_4);
        Button b5 = (Button) view.findViewById(R.id.button_5);
        Button b6 = (Button) view.findViewById(R.id.button_6);
        Button b7 = (Button) view.findViewById(R.id.button_7);

        b1.getBackground().setAlpha(64);
        b2.getBackground().setAlpha(64);
        b3.getBackground().setAlpha(64);
        b4.getBackground().setAlpha(64);
        b5.getBackground().setAlpha(64);
        b6.getBackground().setAlpha(64);
        b7.getBackground().setAlpha(64);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", db_name + "mal");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", db_name + "eng");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", db_name + "hindi");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", db_name + "arabic");
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
                bundle.putString("name", db_name + "urdu");
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
                bundle.putString("name", db_name + "sanskrit");
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
                bundle.putString("name", db_name + "tamil");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });


        return view;
    }

}
