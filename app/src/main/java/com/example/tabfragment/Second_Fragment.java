package com.example.tabfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tabfragment.databinding.FirstFragmentBinding;
import com.example.tabfragment.databinding.SecondFragmentBinding;

public class Second_Fragment extends Fragment {
    SecondFragmentBinding secondFragmentBinding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      secondFragmentBinding=SecondFragmentBinding.inflate(getLayoutInflater());
      return secondFragmentBinding.getRoot();
    }
}
