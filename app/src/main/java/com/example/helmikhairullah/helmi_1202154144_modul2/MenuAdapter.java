package com.example.helmikhairullah.helmi_1202154144_modul2;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Helmi Khairullah on 18/02/2018.
 */

    public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{

        // membuat array, kontainer gambar dan kontex aktivitas untuk konstruktor
        private GradientDrawable mGradientDrawable;
        private ArrayList<menu> mMenuData;
        private Context mContext;

        MenuAdapter(Context mContext, ArrayList<menu> mMenuData) {
            this.mMenuData = mMenuData;
            this.mContext = mContext;
//        set conatainer untuk gambar
            mGradientDrawable = new GradientDrawable();
            mGradientDrawable.setSize(70,70);
        }

        //    mengemmbalikan menuviewholder
        @Override
        public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MenuViewHolder(mContext, LayoutInflater.from(mContext)
                    .inflate(R.layout.daftarmenu1,parent,false), mGradientDrawable);
        }

        //    mengisi item recycler view
        @Override
        public void onBindViewHolder(MenuViewHolder holder, int position) {
            menu current = (menu) mMenuData.get(position);
            holder.bindTo((menu) current);
        }

        @Override
        public int getItemCount() {
            return mMenuData.size();
        }

        public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

            private TextView mNama;
            private TextView mHarga;
            private ImageView mMenuImage;
            private Context mContext;
            private menu mCurrentMenu;
            private GradientDrawable mGradientDrawable;

            // mencari id pada layout list_item
            MenuViewHolder(Context context, View itemView, GradientDrawable gradientDrawable) {
                super(itemView);
                mNama = (TextView)itemView.findViewById(R.id.nama);
                mHarga = (TextView)itemView.findViewById(R.id.hargaMenu);
                mMenuImage = (ImageView)itemView.findViewById(R.id.tugas);
                mContext = context;
                mGradientDrawable = gradientDrawable;

                itemView.setOnClickListener(this);
            }

            //        set semua layout dengan nilai string dan gambar dari objek menu
            public void bindTo(menu current) {
                mNama.setText(current.getNama());
                mHarga.setText(current.getHargaMenu());
                mCurrentMenu = current;
//            load gambar dengan glide menggunkan id gambar ke layout
                Glide.with(mContext).load(current.
                        getImageMenu()).placeholder(mGradientDrawable).into(mMenuImage);

            }

            // membuka deatil menu dengan intent dari menu.
            @Override
            public void onClick(View view) {
                Intent detailIntent = menu.starter(mContext, mCurrentMenu.getNama(),
                        mCurrentMenu.getHargaMenu(), mCurrentMenu.getKomposisi(),
                        mCurrentMenu.getImageMenu());

                mContext.startActivity(detailIntent);
            }


        }
}
