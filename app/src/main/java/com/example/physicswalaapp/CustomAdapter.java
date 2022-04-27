package com.example.physicswalaapp;

//creating the custom adapter to display in recycler view

import android.app.DownloadManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    List<model> postList;
    ImageView imageview;//decclaring the imageview variabble
    private Context context;
    public CustomAdapter(Context context, List<model> postList) {
        this.postList=postList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowitem,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.name.setText(postList.get(position).getName());
        holder.subject.setText(postList.get(position).getSubject());
        holder.qualification.setText(postList.get(position).getQualification());
        Picasso.get().load(postList.get(position).getProfileimage()).into(imageview);

    }
    @Override
    public int getItemCount() {
        return postList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,subject,qualification;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);//getting the declared name textview in xml
            qualification=itemView.findViewById(R.id.qualification);//getting the declared qualificaton textview in xml
            subject=itemView.findViewById(R.id.subjects);//getting the declared subject textview in xml
            imageview=(ImageView) itemView.findViewById(R.id.profileimage);//getting the declared  imageview in xml
        }
    }
}
