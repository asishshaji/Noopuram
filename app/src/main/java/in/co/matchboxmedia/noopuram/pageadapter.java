package in.co.matchboxmedia.noopuram;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by mrkai on 15/3/18.
 */
public class pageadapter extends FragmentStatePagerAdapter {
    private int mnooftabs;
    public pageadapter(FragmentManager fm,int nooftabs) {
        super(fm);
        this.mnooftabs=nooftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                fragment_tab1 t1=new fragment_tab1();
                return t1;
            case 1:
                fragment_tab2 t2=new fragment_tab2();
                return t2;
            case 2:
                fragment_tab3 t3=new fragment_tab3();
                return t3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mnooftabs;
    }
}
