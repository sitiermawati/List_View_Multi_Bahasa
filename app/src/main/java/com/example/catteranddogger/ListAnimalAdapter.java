package com.example.catteranddogger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.catteranddogger.model.Animal;

import java.util.List;

public class ListAnimalAdapter extends ArrayAdapter<Animal> {

    Context context;

    public  ListAnimalAdapter(Context context, List<Animal> animals) {
        super(context, R.layout.row_list_animal, animals);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textJenis;
        TextView textAsal;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Animal animal = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_list_animal, parent, false);
            viewHolder.textJenis =  convertView.findViewById(R.id.row_text_jenis);
            viewHolder.textAsal = (TextView) convertView.findViewById(R.id.row_text_asal);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_hewan);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textJenis.setText(animal.getRas());
        viewHolder.textAsal.setText(animal.getLatin());
        viewHolder.gambar.setImageDrawable(context.getDrawable(animal.getDrawableRes()));
        return convertView;
    }
}

