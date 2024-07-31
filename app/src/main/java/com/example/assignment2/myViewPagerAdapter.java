package com.example.assignment2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.assignment2.fragments.LargeBreedFragment;
import com.example.assignment2.fragments.PuppiesFragment;
import com.example.assignment2.fragments.SmallBreedFragment;
import com.example.assignment2.fragments.TrainedFragment;

public class myViewPagerAdapter extends FragmentStateAdapter {
    public myViewPagerAdapter(@NonNull FragmentActivity fragmentactivity) {
        super(fragmentactivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new PuppiesFragment();
            case 1:
                return new TrainedFragment();
            case 2:
                return new SmallBreedFragment();
            case 3:
                return new LargeBreedFragment();
            default:
                return new PuppiesFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
