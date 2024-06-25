package com.projetosrafaelfemina.whatsapplist.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projetosrafaelfemina.whatsapplist.Model.User;
import com.projetosrafaelfemina.whatsapplist.R;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList = new ArrayList<>();

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        listItem = layoutInflater.inflate(R.layout.user_item, parent, false);
        return new UserViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.photo.setImageResource(userList.get(position).getFoto());
        holder.name.setText(userList.get(position).getNome());
        holder.message.setText(userList.get(position).getMensagem());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private ImageView photo;
        private TextView name;
        private TextView message;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            photo = itemView.findViewById(R.id.userPhoto);
            name = itemView.findViewById(R.id.userName);
            message = itemView.findViewById(R.id.mensagemUsuario);
        }
    }

}
