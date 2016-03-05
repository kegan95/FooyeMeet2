package com.fooyemeet2.Activities.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fooyemeet2.R;

/**
 * Created by berrichi on 29/02/2016.
 */
public class FragmentLogin extends Fragment {
    public static  FragmentLogin newInstance(){
        FragmentLogin fragmentLogin = new FragmentLogin();
        Bundle args = new Bundle();
        return fragmentLogin;
    }

    EditText login = null;
    EditText password = null;
    Button connexion = null;
    Button register = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        connexion =  (Button) rootView.findViewById(R.id.loginButton);
        register = (Button) rootView.findViewById(R.id.registerButton);
        login = (EditText) rootView.findViewById(R.id.loginEditText);
        password = (EditText) rootView.findViewById(R.id.password);

        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loginstr = login.getText().toString();
                String passwordstr = password.getText().toString();
                if (loginstr.isEmpty()|| passwordstr.isEmpty()){
                    Toast.makeText(getActivity(), "login or password incorrect", Toast.LENGTH_SHORT).show();
                }
                else {
                   // AsynctaskLogin async = new AsynctaskLogin(getActivity());
                    //async.execute(loginstr,passwordstr);
                }
            }
        });

        return rootView;
    }
}

