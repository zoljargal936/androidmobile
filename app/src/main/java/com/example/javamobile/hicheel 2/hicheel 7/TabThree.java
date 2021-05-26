package com.example.myapplication.Lesson7;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import java.util.ArrayList;

import com.example.myapplication.R;

import java.util.ArrayList;

public class TabThree extends Fragment {

    private GridView gallery;
    private ArrayList imgs=new ArrayList<>();

    public TabThree() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_three, container, false);
        gallery = (GridView) view.findViewById(R.id.gv);
        imgs.add(new Item("test1 1",R.drawable.test1));
        imgs.add(new Item("test1 2",R.drawable.test2));
        imgs.add(new Item("Landscape",R.drawable.test));
        imgs.add(new Item("Photo1",R.drawable.test3));
        imgs.add(new Item("Photo2",R.drawable.test4));
        imgs.add(new Item("test6",R.drawable.test6));
        imgs.add(new Item("test4",R.drawable.test4));
        imgs.add(new Item("test3",R.drawable.test3));
        imgs.add(new Item("test2",R.drawable.test2));
        imgs.add(new Item("test1",R.drawable.test1));
        imgs.add(new Item("test",R.drawable.test));
        MyAdapter myAdapter=new MyAdapter(getActivity(),R.layout.grid_view_items,imgs);
        gallery.setAdapter(myAdapter);
        return view;
    }
}