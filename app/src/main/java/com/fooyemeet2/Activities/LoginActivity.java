package com.fooyemeet2.Activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.fooyemeet2.Activities.Fragments.FragmentLogin;
import com.fooyemeet2.R;

/**
 * Created by berrichi on 29/02/2016.
 */
public class LoginActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        getSupportFragmentManager().beginTransaction().replace(R.id.container_login, new FragmentLogin()).commit();
    }
}

