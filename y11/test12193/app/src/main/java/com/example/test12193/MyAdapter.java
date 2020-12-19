package com.example.test12193;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdapter extends BaseAdapter {
    private String[] data;
    private Context mContext;
  public MyAdapter(Context mContext, String[] data){
      super();
      this.mContext=mContext;
      this.data=data;
  }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(mContext);
         final View view=inflater.inflate(R.layout.y1,null);
        ImageView imageView=view.findViewById(R.id.imageView);
        final TextView textView=view.findViewById(R.id.textView);
          final TextView textView2=view.findViewById(R.id.textView2);
        Button button=view.findViewById(R.id.button);
        imageView.setImageResource(R.mipmap.ic_launcher);
        textView.setText(data[position]);
         button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        textView2.setText("下载了1次"); }
               });
         return view;
    }
}
