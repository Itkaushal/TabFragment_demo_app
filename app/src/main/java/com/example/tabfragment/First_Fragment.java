package com.example.tabfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tabfragment.databinding.FirstFragmentBinding;

public class First_Fragment extends Fragment {
    FirstFragmentBinding firstFragmentBinding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      firstFragmentBinding=FirstFragmentBinding.inflate(getLayoutInflater());
      return firstFragmentBinding.getRoot();
    }
}
