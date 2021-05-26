package com.example.myapplication.Midterm;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.myapplication.Lesson7.Item;
import com.example.myapplication.Lesson7.MyAdapter;
import com.example.myapplication.R;

import java.util.ArrayList;

public class FragmentThree extends Fragment {

    private GridView gallery;
    private ArrayList imgs=new ArrayList<>();
    private String[] infos = {
            "test1 1", "test1 3", "test",
            "test1 1", "test4", "test6",
            "test4", "test3", "test2",
            "test1", "test"
    };

    public FragmentThree() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        gallery = (GridView) view.findViewById(R.id.gv);
        imgs.add(R.drawable.test1);
        imgs.add(R.drawable.test2);
        imgs.add(R.drawable.test);
        imgs.add(R.drawable.test3);
        imgs.add(R.drawable.test4);
        imgs.add(R.drawable.test6);
        imgs.add(R.drawable.test4);
        imgs.add(R.drawable.test3);
        imgs.add(R.drawable.test2);
        imgs.add(R.drawable.test1);
        imgs.add(R.drawable.test);
        MyAdapter myAdapter=new MyAdapter(getActivity(),R.layout.grid_view_items,imgs);
        gallery.setAdapter(myAdapter);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(
                        getActivity(),
                        GalleryInfo.class
                );
                i.putExtra("png", (Integer) imgs.get(position));
                i.putExtra("info", infos[position]);
                startActivity(i);
            }
        });

        return view;
    }
}