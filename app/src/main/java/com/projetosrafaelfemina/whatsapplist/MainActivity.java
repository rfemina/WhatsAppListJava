package com.projetosrafaelfemina.whatsapplist;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.projetosrafaelfemina.whatsapplist.Adapter.UserAdapter;
import com.projetosrafaelfemina.whatsapplist.Model.User;
import com.projetosrafaelfemina.whatsapplist.RecyclerItemClickListener.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_user;
    private List<User> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recycler_user = findViewById(R.id.recycler_users);
        recycler_user.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        recycler_user.setHasFixedSize(true);
        UserAdapter adapterUsuario = new UserAdapter(userList);
        recycler_user.setAdapter(adapterUsuario);
        Users();

        // Evento de click na recyclerView
        recycler_user.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), recycler_user,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        User user = userList.get(position);
                        Toast.makeText(getApplicationContext(), "Usuário: " + user.getNome(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        User user = userList.get(position);
                        Toast.makeText(getApplicationContext(), "Usuário: " + user.getNome(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    }
                }));
    }

    public void Users() {
        User user1 = new User(R.drawable.user1, "Rafael", "Olá, que horas será o churrasco?");
        userList.add(user1);

        User user2 = new User(R.drawable.user2, "Paula", "Hoje está gostoso para fazer um churrasco");
        userList.add(user2);

        User user3 = new User(R.drawable.user1, "Marcos", "Bora fazer um churras?");
        userList.add(user3);

        User user4 = new User(R.drawable.user2, "Bruna", "Vou fazer um doce para o churrasco");
        userList.add(user4);

        User user5 = new User(R.drawable.user1, "Pedro", "Qual o endereço para o churras?");
        userList.add(user5);

        User user6 = new User(R.drawable.user2, "Bianca", "Oque vai precisar levar?");
        userList.add(user6);

        User user7 = new User(R.drawable.user1, "João da Silva", "To passando no mercado, ta faltando algo?");
        userList.add(user7);

        User user8 = new User(R.drawable.user2, "Maria Clara", "Vou levar os pratos pro churrasco");
        userList.add(user8);

        User user9 = new User(R.drawable.user1, "Cleber", "Qual o endereço para o churras?");
        userList.add(user9);

        User user10 = new User(R.drawable.user2, "Leticia", "Oque vai precisar levar?");
        userList.add(user10);

        User user11 = new User(R.drawable.user1, "Felipe Rodrigues", "To passando no mercado, ta faltando algo?");
        userList.add(user11);

        User user12 = new User(R.drawable.user2, "Janaina", "Vou levar os pratos pro churrasco");
        userList.add(user12);

    }


}