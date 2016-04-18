package com.ict.mobile.fragmentsdemo.ui;

import android.support.v4.app.Fragment;
import android.view.View;

import com.ict.mobile.fragmentsdemo.MainActivity;
import com.ict.mobile.fragmentsdemo.util.DebugLog;

public abstract class BaseFragment extends Fragment {

    protected View m_View;

    @Override
    public void onResume() {
        super.onResume();
        ((MainActivity) getActivity()).m_Fragment = this;
    }

    public abstract String getTagName();

    public abstract void onClick(View view);
}
