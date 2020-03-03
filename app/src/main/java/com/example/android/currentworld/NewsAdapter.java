package com.example.android.currentworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter <News> {


    public NewsAdapter(Context context, List<News> news){
        super(context, 0, news);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if( listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item,parent,false);
        }
        // Get the position of the item on the listView
        News currentNews = getItem(position);

        // titleView for current news casted in the TextView
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentNews.getTitle());

        // sectionView for current news casted in the TextView
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        if (sectionView==null){

        }
        sectionView.setText(currentNews.getSection());

        // dateView for current news casted in the TextView
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(currentNews.getDate());

        // authorView for current news casted in the TextView
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        authorView.setText(currentNews.getAuthor());




        // return listItemView
        return listItemView;
    }



}
