package com.example.yumnaasim.smc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Yumna Asim on 6/16/2017.
 */
public class ImageAdapter extends BaseAdapter {
    Context context;
    private final LayoutInflater mInflater;
    private Integer[] thumbsId = {
            R.drawable.about_smc,R.drawable.commisioner,R.drawable.amrut,
            R.drawable.job_opportunity,R.drawable.active_tenders,R.drawable.where_can_i,
            R.drawable.complaints,R.drawable.online_forms,R.drawable.feedback,
            R.drawable.citizen_facilities,R.drawable.elected_wing,R.drawable.admin_wing,
            R.drawable.birth_certificate, R.drawable.death_certificate, R.drawable.shops_establishment,
            R.drawable.water_meter,R.drawable.rainfall,R.drawable.emergency_toolkit,
            R.drawable.capture,R.drawable.location



    };
//    R.drawable.birth_certificate, R.drawable.death_certificate, R.drawable.shops_establishment,
//    R.drawable.job_opportunity,R.drawable.active_tenders,R.drawable.where_can_i,
//    R.drawable.water_meter,R.drawable.rainfall,R.drawable.emergency_toolkit,
//    R.drawable.citizen_facilities,R.drawable.admin_wing,R.drawable.elected_wing,
//    R.drawable.complaints,R.drawable.online_forms,R.drawable.feedback

    ImageAdapter(Context context)
    {
        this.context = context;
        mInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return thumbsId.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

//    @Override
//    public View getView(int position, View view, ViewGroup viewGroup) {
//        ImageView imageView;
//        if (view == null)
//        {
//            // if view is not recyled view
//            imageView = new ImageView(context);
////            imageView.setLayoutParams(new GridView.LayoutParams(200,200));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(0,4,0,0);
//
//
//        }
//        else
//        {
//            imageView = (ImageView) view;
//        }
//        imageView.setImageResource(thumbsId[position]);
//        return imageView;
//
//    }
@Override
public View getView(int i, View view, ViewGroup viewGroup) {
    View v = view;
    ImageView picture;



    if (v == null) {
        v = mInflater.inflate(R.layout.grid_item, viewGroup, false);
        v.setTag(R.id.picture, v.findViewById(R.id.picture));
        v.setTag(R.id.text, v.findViewById(R.id.text));
    }

    picture = (ImageView) v.getTag(R.id.picture);
    picture.setImageResource(thumbsId[i]);
    return v;
}

}
