package com.vit.mathathon;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.navigation.NavigationView;

public class BottomNavigationDrawerFragment extends BottomSheetDialogFragment {


    NavigationView navigationView;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bottomsheet, container,
                false);
        navigationView = view.findViewById(R.id.navigation_view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId())
                {
                    case R.id.siam:
                        Intent intent = new Intent(getActivity(), Siam.class);
                        startActivity(intent);
                        break;
                    case R.id.event:
                        Intent intent1 = new Intent(getActivity(), Event.class);
                        startActivity(intent1);
                        break;
                    case R.id.contact:
                        Intent intent2 = new Intent(getActivity(), Contact.class);
                        startActivity(intent2);
                        break;
                    case R.id.schedule:
                        Intent intent3 = new Intent(getActivity(), MainActivity.class);
                        startActivity(intent3);
                        getActivity().finish();
                        break;
                }
                return false;
            }
        });

    }
}
