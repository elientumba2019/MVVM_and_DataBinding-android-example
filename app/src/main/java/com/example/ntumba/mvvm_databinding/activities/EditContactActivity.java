package com.example.ntumba.mvvm_databinding.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.ntumba.mvvm_databinding.fragments.EditContactFragment;

/**
 * Created by ntumba on 17-10-15.
 */

public class EditContactActivity extends SingleAbstractActivity {



    /**
     * returns the corresponding fragment
     * @return
     */
    @Override
    public Fragment getFragment() {
        return EditContactFragment.getInstance();
    }


    /**
     * returns an intent that will be used to start
     * this activity
     * @param context
     * @return
     */
    public static Intent getIntent(Context context){
        return new Intent(context , EditContactActivity.class);
    }
}
