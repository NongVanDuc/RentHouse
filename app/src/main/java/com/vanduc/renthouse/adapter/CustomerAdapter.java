package com.vanduc.renthouse.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vanduc.renthouse.R;
import com.vanduc.renthouse.model.Customer;
import com.vanduc.renthouse.model.House;
import com.vanduc.renthouse.view.activity.DetailActivity;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> implements View.OnClickListener {

    private ArrayList<Customer> ls;
    private Context context;
    private LayoutInflater inflater;

    Intent intent;

    public CustomerAdapter(ArrayList<Customer> ls, Context context) {
        this.ls = ls;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_customer, null); // Hihihi
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        viewHolder.itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(context, DetailActivity.class);
        intent.addFlags(FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgInfor;
        private TextView tvAddress;
        private TextView tvNameCustomer;
        private TextView tvContact;
        private TextView tvAddressDetail;






        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgInfor = (ImageView) itemView.findViewById(R.id.img_infor);
            tvAddress = (TextView) itemView.findViewById(R.id.tv_address);
            tvNameCustomer = (TextView) itemView.findViewById(R.id.tv_name_customer);
            tvContact = (TextView) itemView.findViewById(R.id.tv_contact);
            tvAddressDetail = (TextView) itemView.findViewById(R.id.tv_address_detail);
        }
    }
}
