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
public class button_frag_drama extends Fragment {


    public button_frag_drama() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_button_frag_drama, container, false);
        Button b1 = view.findViewById(R.id.button_1);
        Button b2 = view.findViewById(R.id.button_2);
        Button b3 = view.findViewById(R.id.button_3);
        Button b4 = view.findViewById(R.id.button_4);
        Button b5 = view.findViewById(R.id.button_5);
        Button b6 = view.findViewById(R.id.button_6);

        Button n1 = view.findViewById(R.id.button_n1);
        Button n2 = view.findViewById(R.id.button_n2);
        Button n3 = view.findViewById(R.id.button_n3);

        n1.getBackground().setAlpha(64);
        n2.getBackground().setAlpha(64);
        n3.getBackground().setAlpha(64);

        b1.getBackground().setAlpha(64);
        b2.getBackground().setAlpha(64);
        b3.getBackground().setAlpha(64);
        b4.getBackground().setAlpha(64);
        b5.getBackground().setAlpha(64);
        b6.getBackground().setAlpha(64);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", "nadakam-mal");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", "nadakam-eng");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", "nadakam-hindi");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leader_frag_first_second_third fragment = new leader_frag_first_second_third();
                Bundle bundle = new Bundle();
                bundle.putString("name", "nadakam-sanskrit");
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
                bundle.putString("name", "mime");
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
                bundle.putString("name", "skit");
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
                bundle.putString("name", "kadha_prasangam");
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
                bundle.putString("name", "mono_act");
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
                bundle.putString("name", "mimicry");
                //set Fragmentclass Arguments
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.common_act, fragment).commit();
            }
        });
        return view;
    }

}
