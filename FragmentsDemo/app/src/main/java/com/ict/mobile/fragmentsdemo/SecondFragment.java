package com.ict.mobile.fragmentsdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ict.mobile.fragmentsdemo.ui.BaseFragment;
import com.ict.mobile.fragmentsdemo.util.DebugLog;

public class SecondFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        m_View = inflater.inflate(R.layout.fragment_second, null);
        return m_View;
    }

    @Override
    public void onStart() {
        super.onStart();
        DebugLog.log();
    }

    @Override
    public void onResume() {
        super.onResume();
        DebugLog.log();
    }

    @Override
    public void onPause() {
        super.onPause();
        DebugLog.log();
    }

    @Override
    public void onStop() {
        super.onStop();
        DebugLog.log();
    }

    @Override
    public String getTagName() {
        return "SecondFragment";
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.next:
                ((MainActivity) getActivity()).launchFragment(new ThirdFragment(), true);
                break;
        }
    }
}
