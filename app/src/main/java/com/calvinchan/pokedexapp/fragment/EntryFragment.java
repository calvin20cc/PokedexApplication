package com.calvinchan.pokedexapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.calvinchan.pokedexapp.R;

public class EntryFragment extends Fragment {

    private ImageView imageView;
    private TextView textView;

    public EntryFragment() {
        // Required empty public constructor
    }

    public static EntryFragment newInstance(String param1, String param2) {
        EntryFragment fragment = new EntryFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_entry, container, false);

        String image = this.getArguments().getString("image");
        String desc = this.getArguments().getString("desc");

        imageView = (ImageView) view.findViewById(R.id.imageView);
        textView = (TextView) view.findViewById(R.id.textView);

        Glide.with(getActivity())
                .load(image)
                .into(imageView);

        textView.setText(desc);

        return view;
    }
}
