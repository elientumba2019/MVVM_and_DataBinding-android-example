package com.example.ntumba.mvvm_databinding.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.ntumba.mvvm_databinding.fragments.EditContactFragment;

import java.util.UUID;

import butterknife.ButterKnife;

/**
 * Created by ntumba on 17-10-15.
 */

public class EditContactActivity extends SingleAbstractActivity {


    private static final String PERSON_ID_KEY = "key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    /**
     * returns the corresponding fragment
     * @return
     */
    @Override
    public Fragment getFragment() {

        //getting the extra contained in the intent
        UUID personId = (UUID) getIntent().getSerializableExtra(PERSON_ID_KEY);
        return EditContactFragment.getInstance(personId);
    }


    /**
     * returns an intent that will be used to start
     * this activity
     * @param context
     * @return
     */
    public static Intent getIntent(Context context , UUID id){
        //returning an intent with an extra
        return new Intent(context , EditContactActivity.class).putExtra(PERSON_ID_KEY , id);
    }
}
