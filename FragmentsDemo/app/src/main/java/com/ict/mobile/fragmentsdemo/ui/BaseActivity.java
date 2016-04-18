package com.ict.mobile.fragmentsdemo.ui;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.ict.mobile.fragmentsdemo.R;

public class BaseActivity extends AppCompatActivity {

    protected BaseFragment m_Fragment;

    private FragmentManager m_FragmentManager;

    private FragmentTransaction m_FragmentTransaction;

    public void launchFragment(BaseFragment fragment, boolean addToBackStack) {
        m_Fragment = fragment;
        m_FragmentManager = getSupportFragmentManager();
        m_FragmentTransaction = m_FragmentManager.beginTransaction();
        m_FragmentTransaction.replace(R.id.content_panel, fragment);

        if (addToBackStack) {
            m_FragmentTransaction.addToBackStack(fragment.getTagName());
        }

        m_FragmentTransaction.commitAllowingStateLoss();
    }
}
