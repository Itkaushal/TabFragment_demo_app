package com.example.tabfragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabAdapter extends FragmentStateAdapter {
    public TabAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0: First_Fragment f1 = new First_Fragment();
            return f1;
            case 1: Second_Fragment f2 = new Second_Fragment();
            return f2;
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
